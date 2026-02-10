# EventsEase Protos

Shared protobuf contracts and generated SDKs for EventsEase clients.

## Generate code

Run from this repository root:

```bash
buf generate
```

Generated outputs:

- `gen/go`: Go protobuf + gRPC stubs + Connect-Go handlers/clients (backend/server-side Go)
- `gen/kotlin`: Android/Kotlin protobuf + Connect stubs
- `gen/swift`: iOS Swift protobuf + Connect stubs
- `gen/web`: TypeScript protobuf + Connect stubs (Next.js/web)

## Web/Next.js generation strategy

`buf.gen.yaml` now generates web code using:

- `buf.build/bufbuild/es` for protobuf TypeScript message/schema types
- `buf.build/connectrpc/es` for Connect service definitions

Both are generated as TypeScript (`target=ts`) to keep the output ergonomic in Next.js projects.

## Using generated web SDK in another Next.js project

Install runtime packages in the consumer project:

```bash
npm i @bufbuild/protobuf @connectrpc/connect @connectrpc/connect-web
```

If you also call backend RPCs from Next.js server routes/actions:

```bash
npm i @connectrpc/connect-node
```

### Browser-side client example (Connect protocol)

```ts
import { create } from "@bufbuild/protobuf";
import { createClient } from "@connectrpc/connect";
import { createConnectTransport } from "@connectrpc/connect-web";

import { EventService } from "./gen/web/proto/v1/event_connect";
import { GetEventsRequestSchema } from "./gen/web/proto/v1/event_pb";

const transport = createConnectTransport({
  baseUrl: process.env.NEXT_PUBLIC_API_BASE_URL!,
});

const eventClient = createClient(EventService, transport);

const response = await eventClient.getEvents(
  create(GetEventsRequestSchema, {
    page: 1,
    limit: 20,
  }),
);
```

### Server-side Next.js client example (calling gRPC backend directly)

```ts
import { createClient } from "@connectrpc/connect";
import { createGrpcTransport } from "@connectrpc/connect-node";

import { UserService } from "./gen/web/proto/v1/user_connect";
import { create } from "@bufbuild/protobuf";
import { CheckUserRequestSchema } from "./gen/web/proto/v1/user_pb";

const transport = createGrpcTransport({
  baseUrl: process.env.GRPC_BASE_URL!,
  httpVersion: "2",
});

const userClient = createClient(UserService, transport);

const response = await userClient.checkUser(
  create(CheckUserRequestSchema, { email: "test@example.com" }),
);
```

## FE vs BE transport expectations

- Browsers cannot call raw gRPC (HTTP/2) directly.
- For browser calls, expose either Connect or gRPC-web on your API edge.
- For Next.js server-side code (route handlers/server actions), you can call pure gRPC directly.

If your backend project only exposes raw gRPC, add a gateway/proxy (for example Envoy) that exposes Connect or gRPC-web for frontend traffic.
