package com.eventsease.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: proto/v1/event.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "eventsease.v1.EventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.eventsease.v1.GetEventsRequest,
      com.eventsease.v1.GetEventsResponse> getGetEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvents",
      requestType = com.eventsease.v1.GetEventsRequest.class,
      responseType = com.eventsease.v1.GetEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventsease.v1.GetEventsRequest,
      com.eventsease.v1.GetEventsResponse> getGetEventsMethod() {
    io.grpc.MethodDescriptor<com.eventsease.v1.GetEventsRequest, com.eventsease.v1.GetEventsResponse> getGetEventsMethod;
    if ((getGetEventsMethod = EventServiceGrpc.getGetEventsMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetEventsMethod = EventServiceGrpc.getGetEventsMethod) == null) {
          EventServiceGrpc.getGetEventsMethod = getGetEventsMethod =
              io.grpc.MethodDescriptor.<com.eventsease.v1.GetEventsRequest, com.eventsease.v1.GetEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetEvents"))
              .build();
        }
      }
    }
    return getGetEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eventsease.v1.GetEventRequest,
      com.eventsease.v1.GetEventResponse> getGetEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvent",
      requestType = com.eventsease.v1.GetEventRequest.class,
      responseType = com.eventsease.v1.GetEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventsease.v1.GetEventRequest,
      com.eventsease.v1.GetEventResponse> getGetEventMethod() {
    io.grpc.MethodDescriptor<com.eventsease.v1.GetEventRequest, com.eventsease.v1.GetEventResponse> getGetEventMethod;
    if ((getGetEventMethod = EventServiceGrpc.getGetEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetEventMethod = EventServiceGrpc.getGetEventMethod) == null) {
          EventServiceGrpc.getGetEventMethod = getGetEventMethod =
              io.grpc.MethodDescriptor.<com.eventsease.v1.GetEventRequest, com.eventsease.v1.GetEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetEvent"))
              .build();
        }
      }
    }
    return getGetEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eventsease.v1.GetEventStatsRequest,
      com.eventsease.v1.GetEventStatsResponse> getGetEventStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventStats",
      requestType = com.eventsease.v1.GetEventStatsRequest.class,
      responseType = com.eventsease.v1.GetEventStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventsease.v1.GetEventStatsRequest,
      com.eventsease.v1.GetEventStatsResponse> getGetEventStatsMethod() {
    io.grpc.MethodDescriptor<com.eventsease.v1.GetEventStatsRequest, com.eventsease.v1.GetEventStatsResponse> getGetEventStatsMethod;
    if ((getGetEventStatsMethod = EventServiceGrpc.getGetEventStatsMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetEventStatsMethod = EventServiceGrpc.getGetEventStatsMethod) == null) {
          EventServiceGrpc.getGetEventStatsMethod = getGetEventStatsMethod =
              io.grpc.MethodDescriptor.<com.eventsease.v1.GetEventStatsRequest, com.eventsease.v1.GetEventStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetEventStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetEventStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetEventStats"))
              .build();
        }
      }
    }
    return getGetEventStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eventsease.v1.CreateEventRequest,
      com.eventsease.v1.CreateEventResponse> getCreateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEvent",
      requestType = com.eventsease.v1.CreateEventRequest.class,
      responseType = com.eventsease.v1.CreateEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventsease.v1.CreateEventRequest,
      com.eventsease.v1.CreateEventResponse> getCreateEventMethod() {
    io.grpc.MethodDescriptor<com.eventsease.v1.CreateEventRequest, com.eventsease.v1.CreateEventResponse> getCreateEventMethod;
    if ((getCreateEventMethod = EventServiceGrpc.getCreateEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getCreateEventMethod = EventServiceGrpc.getCreateEventMethod) == null) {
          EventServiceGrpc.getCreateEventMethod = getCreateEventMethod =
              io.grpc.MethodDescriptor.<com.eventsease.v1.CreateEventRequest, com.eventsease.v1.CreateEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.CreateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.CreateEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("CreateEvent"))
              .build();
        }
      }
    }
    return getCreateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eventsease.v1.GetUserEventsRequest,
      com.eventsease.v1.GetEventsResponse> getGetUserEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserEvents",
      requestType = com.eventsease.v1.GetUserEventsRequest.class,
      responseType = com.eventsease.v1.GetEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventsease.v1.GetUserEventsRequest,
      com.eventsease.v1.GetEventsResponse> getGetUserEventsMethod() {
    io.grpc.MethodDescriptor<com.eventsease.v1.GetUserEventsRequest, com.eventsease.v1.GetEventsResponse> getGetUserEventsMethod;
    if ((getGetUserEventsMethod = EventServiceGrpc.getGetUserEventsMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetUserEventsMethod = EventServiceGrpc.getGetUserEventsMethod) == null) {
          EventServiceGrpc.getGetUserEventsMethod = getGetUserEventsMethod =
              io.grpc.MethodDescriptor.<com.eventsease.v1.GetUserEventsRequest, com.eventsease.v1.GetEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetUserEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetUserEvents"))
              .build();
        }
      }
    }
    return getGetUserEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eventsease.v1.GetUserEventsRequest,
      com.eventsease.v1.GetEventsResponse> getGetSavedEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSavedEvents",
      requestType = com.eventsease.v1.GetUserEventsRequest.class,
      responseType = com.eventsease.v1.GetEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventsease.v1.GetUserEventsRequest,
      com.eventsease.v1.GetEventsResponse> getGetSavedEventsMethod() {
    io.grpc.MethodDescriptor<com.eventsease.v1.GetUserEventsRequest, com.eventsease.v1.GetEventsResponse> getGetSavedEventsMethod;
    if ((getGetSavedEventsMethod = EventServiceGrpc.getGetSavedEventsMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetSavedEventsMethod = EventServiceGrpc.getGetSavedEventsMethod) == null) {
          EventServiceGrpc.getGetSavedEventsMethod = getGetSavedEventsMethod =
              io.grpc.MethodDescriptor.<com.eventsease.v1.GetUserEventsRequest, com.eventsease.v1.GetEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSavedEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetUserEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetSavedEvents"))
              .build();
        }
      }
    }
    return getGetSavedEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eventsease.v1.ToggleSavedEventRequest,
      com.eventsease.v1.ToggleSavedEventResponse> getToggleSavedEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleSavedEvent",
      requestType = com.eventsease.v1.ToggleSavedEventRequest.class,
      responseType = com.eventsease.v1.ToggleSavedEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventsease.v1.ToggleSavedEventRequest,
      com.eventsease.v1.ToggleSavedEventResponse> getToggleSavedEventMethod() {
    io.grpc.MethodDescriptor<com.eventsease.v1.ToggleSavedEventRequest, com.eventsease.v1.ToggleSavedEventResponse> getToggleSavedEventMethod;
    if ((getToggleSavedEventMethod = EventServiceGrpc.getToggleSavedEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getToggleSavedEventMethod = EventServiceGrpc.getToggleSavedEventMethod) == null) {
          EventServiceGrpc.getToggleSavedEventMethod = getToggleSavedEventMethod =
              io.grpc.MethodDescriptor.<com.eventsease.v1.ToggleSavedEventRequest, com.eventsease.v1.ToggleSavedEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleSavedEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.ToggleSavedEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.ToggleSavedEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("ToggleSavedEvent"))
              .build();
        }
      }
    }
    return getToggleSavedEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceStub>() {
        @java.lang.Override
        public EventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceStub(channel, callOptions);
        }
      };
    return EventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub>() {
        @java.lang.Override
        public EventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceBlockingStub(channel, callOptions);
        }
      };
    return EventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub>() {
        @java.lang.Override
        public EventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceFutureStub(channel, callOptions);
        }
      };
    return EventServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getEvents(com.eventsease.v1.GetEventsRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsMethod(), responseObserver);
    }

    /**
     */
    default void getEvent(com.eventsease.v1.GetEventRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventMethod(), responseObserver);
    }

    /**
     */
    default void getEventStats(com.eventsease.v1.GetEventStatsRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventStatsMethod(), responseObserver);
    }

    /**
     */
    default void createEvent(com.eventsease.v1.CreateEventRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.CreateEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEventMethod(), responseObserver);
    }

    /**
     */
    default void getUserEvents(com.eventsease.v1.GetUserEventsRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserEventsMethod(), responseObserver);
    }

    /**
     */
    default void getSavedEvents(com.eventsease.v1.GetUserEventsRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSavedEventsMethod(), responseObserver);
    }

    /**
     */
    default void toggleSavedEvent(com.eventsease.v1.ToggleSavedEventRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.ToggleSavedEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleSavedEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EventService.
   */
  public static abstract class EventServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EventService.
   */
  public static final class EventServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EventServiceStub> {
    private EventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEvents(com.eventsease.v1.GetEventsRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEvent(com.eventsease.v1.GetEventRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventStats(com.eventsease.v1.GetEventStatsRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEvent(com.eventsease.v1.CreateEventRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.CreateEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserEvents(com.eventsease.v1.GetUserEventsRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSavedEvents(com.eventsease.v1.GetUserEventsRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSavedEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleSavedEvent(com.eventsease.v1.ToggleSavedEventRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.ToggleSavedEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleSavedEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EventService.
   */
  public static final class EventServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.eventsease.v1.GetEventsResponse getEvents(com.eventsease.v1.GetEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eventsease.v1.GetEventResponse getEvent(com.eventsease.v1.GetEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eventsease.v1.GetEventStatsResponse getEventStats(com.eventsease.v1.GetEventStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eventsease.v1.CreateEventResponse createEvent(com.eventsease.v1.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eventsease.v1.GetEventsResponse getUserEvents(com.eventsease.v1.GetUserEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eventsease.v1.GetEventsResponse getSavedEvents(com.eventsease.v1.GetUserEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSavedEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eventsease.v1.ToggleSavedEventResponse toggleSavedEvent(com.eventsease.v1.ToggleSavedEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleSavedEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EventService.
   */
  public static final class EventServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventServiceFutureStub> {
    private EventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventsease.v1.GetEventsResponse> getEvents(
        com.eventsease.v1.GetEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventsease.v1.GetEventResponse> getEvent(
        com.eventsease.v1.GetEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventsease.v1.GetEventStatsResponse> getEventStats(
        com.eventsease.v1.GetEventStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventsease.v1.CreateEventResponse> createEvent(
        com.eventsease.v1.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventsease.v1.GetEventsResponse> getUserEvents(
        com.eventsease.v1.GetUserEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventsease.v1.GetEventsResponse> getSavedEvents(
        com.eventsease.v1.GetUserEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSavedEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventsease.v1.ToggleSavedEventResponse> toggleSavedEvent(
        com.eventsease.v1.ToggleSavedEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleSavedEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EVENTS = 0;
  private static final int METHODID_GET_EVENT = 1;
  private static final int METHODID_GET_EVENT_STATS = 2;
  private static final int METHODID_CREATE_EVENT = 3;
  private static final int METHODID_GET_USER_EVENTS = 4;
  private static final int METHODID_GET_SAVED_EVENTS = 5;
  private static final int METHODID_TOGGLE_SAVED_EVENT = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EVENTS:
          serviceImpl.getEvents((com.eventsease.v1.GetEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT:
          serviceImpl.getEvent((com.eventsease.v1.GetEventRequest) request,
              (io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_STATS:
          serviceImpl.getEventStats((com.eventsease.v1.GetEventStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventStatsResponse>) responseObserver);
          break;
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((com.eventsease.v1.CreateEventRequest) request,
              (io.grpc.stub.StreamObserver<com.eventsease.v1.CreateEventResponse>) responseObserver);
          break;
        case METHODID_GET_USER_EVENTS:
          serviceImpl.getUserEvents((com.eventsease.v1.GetUserEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventsResponse>) responseObserver);
          break;
        case METHODID_GET_SAVED_EVENTS:
          serviceImpl.getSavedEvents((com.eventsease.v1.GetUserEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.eventsease.v1.GetEventsResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_SAVED_EVENT:
          serviceImpl.toggleSavedEvent((com.eventsease.v1.ToggleSavedEventRequest) request,
              (io.grpc.stub.StreamObserver<com.eventsease.v1.ToggleSavedEventResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.eventsease.v1.GetEventsRequest,
              com.eventsease.v1.GetEventsResponse>(
                service, METHODID_GET_EVENTS)))
        .addMethod(
          getGetEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.eventsease.v1.GetEventRequest,
              com.eventsease.v1.GetEventResponse>(
                service, METHODID_GET_EVENT)))
        .addMethod(
          getGetEventStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.eventsease.v1.GetEventStatsRequest,
              com.eventsease.v1.GetEventStatsResponse>(
                service, METHODID_GET_EVENT_STATS)))
        .addMethod(
          getCreateEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.eventsease.v1.CreateEventRequest,
              com.eventsease.v1.CreateEventResponse>(
                service, METHODID_CREATE_EVENT)))
        .addMethod(
          getGetUserEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.eventsease.v1.GetUserEventsRequest,
              com.eventsease.v1.GetEventsResponse>(
                service, METHODID_GET_USER_EVENTS)))
        .addMethod(
          getGetSavedEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.eventsease.v1.GetUserEventsRequest,
              com.eventsease.v1.GetEventsResponse>(
                service, METHODID_GET_SAVED_EVENTS)))
        .addMethod(
          getToggleSavedEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.eventsease.v1.ToggleSavedEventRequest,
              com.eventsease.v1.ToggleSavedEventResponse>(
                service, METHODID_TOGGLE_SAVED_EVENT)))
        .build();
  }

  private static abstract class EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.eventsease.v1.EventProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventService");
    }
  }

  private static final class EventServiceFileDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier {
    EventServiceFileDescriptorSupplier() {}
  }

  private static final class EventServiceMethodDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EventServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
              .addMethod(getGetEventsMethod())
              .addMethod(getGetEventMethod())
              .addMethod(getGetEventStatsMethod())
              .addMethod(getCreateEventMethod())
              .addMethod(getGetUserEventsMethod())
              .addMethod(getGetSavedEventsMethod())
              .addMethod(getToggleSavedEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
