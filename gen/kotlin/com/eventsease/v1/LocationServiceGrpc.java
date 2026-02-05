package com.eventsease.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: proto/v1/location.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LocationServiceGrpc {

  private LocationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "eventsease.v1.LocationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.eventsease.v1.GetPlaceDetailsRequest,
      com.eventsease.v1.GetPlaceDetailsResponse> getGetPlaceDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlaceDetails",
      requestType = com.eventsease.v1.GetPlaceDetailsRequest.class,
      responseType = com.eventsease.v1.GetPlaceDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventsease.v1.GetPlaceDetailsRequest,
      com.eventsease.v1.GetPlaceDetailsResponse> getGetPlaceDetailsMethod() {
    io.grpc.MethodDescriptor<com.eventsease.v1.GetPlaceDetailsRequest, com.eventsease.v1.GetPlaceDetailsResponse> getGetPlaceDetailsMethod;
    if ((getGetPlaceDetailsMethod = LocationServiceGrpc.getGetPlaceDetailsMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getGetPlaceDetailsMethod = LocationServiceGrpc.getGetPlaceDetailsMethod) == null) {
          LocationServiceGrpc.getGetPlaceDetailsMethod = getGetPlaceDetailsMethod =
              io.grpc.MethodDescriptor.<com.eventsease.v1.GetPlaceDetailsRequest, com.eventsease.v1.GetPlaceDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlaceDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetPlaceDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetPlaceDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("GetPlaceDetails"))
              .build();
        }
      }
    }
    return getGetPlaceDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eventsease.v1.GetReverseGeocodeRequest,
      com.eventsease.v1.GetReverseGeocodeResponse> getGetReverseGeocodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReverseGeocode",
      requestType = com.eventsease.v1.GetReverseGeocodeRequest.class,
      responseType = com.eventsease.v1.GetReverseGeocodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventsease.v1.GetReverseGeocodeRequest,
      com.eventsease.v1.GetReverseGeocodeResponse> getGetReverseGeocodeMethod() {
    io.grpc.MethodDescriptor<com.eventsease.v1.GetReverseGeocodeRequest, com.eventsease.v1.GetReverseGeocodeResponse> getGetReverseGeocodeMethod;
    if ((getGetReverseGeocodeMethod = LocationServiceGrpc.getGetReverseGeocodeMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getGetReverseGeocodeMethod = LocationServiceGrpc.getGetReverseGeocodeMethod) == null) {
          LocationServiceGrpc.getGetReverseGeocodeMethod = getGetReverseGeocodeMethod =
              io.grpc.MethodDescriptor.<com.eventsease.v1.GetReverseGeocodeRequest, com.eventsease.v1.GetReverseGeocodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReverseGeocode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetReverseGeocodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.GetReverseGeocodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("GetReverseGeocode"))
              .build();
        }
      }
    }
    return getGetReverseGeocodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eventsease.v1.SearchPlacesRequest,
      com.eventsease.v1.SearchPlacesResponse> getSearchPlacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchPlaces",
      requestType = com.eventsease.v1.SearchPlacesRequest.class,
      responseType = com.eventsease.v1.SearchPlacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventsease.v1.SearchPlacesRequest,
      com.eventsease.v1.SearchPlacesResponse> getSearchPlacesMethod() {
    io.grpc.MethodDescriptor<com.eventsease.v1.SearchPlacesRequest, com.eventsease.v1.SearchPlacesResponse> getSearchPlacesMethod;
    if ((getSearchPlacesMethod = LocationServiceGrpc.getSearchPlacesMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getSearchPlacesMethod = LocationServiceGrpc.getSearchPlacesMethod) == null) {
          LocationServiceGrpc.getSearchPlacesMethod = getSearchPlacesMethod =
              io.grpc.MethodDescriptor.<com.eventsease.v1.SearchPlacesRequest, com.eventsease.v1.SearchPlacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchPlaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.SearchPlacesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventsease.v1.SearchPlacesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("SearchPlaces"))
              .build();
        }
      }
    }
    return getSearchPlacesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceStub>() {
        @java.lang.Override
        public LocationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceStub(channel, callOptions);
        }
      };
    return LocationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceBlockingStub>() {
        @java.lang.Override
        public LocationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceBlockingStub(channel, callOptions);
        }
      };
    return LocationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceFutureStub>() {
        @java.lang.Override
        public LocationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceFutureStub(channel, callOptions);
        }
      };
    return LocationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPlaceDetails(com.eventsease.v1.GetPlaceDetailsRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetPlaceDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlaceDetailsMethod(), responseObserver);
    }

    /**
     */
    default void getReverseGeocode(com.eventsease.v1.GetReverseGeocodeRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetReverseGeocodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReverseGeocodeMethod(), responseObserver);
    }

    /**
     */
    default void searchPlaces(com.eventsease.v1.SearchPlacesRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.SearchPlacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchPlacesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LocationService.
   */
  public static abstract class LocationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LocationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LocationService.
   */
  public static final class LocationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LocationServiceStub> {
    private LocationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPlaceDetails(com.eventsease.v1.GetPlaceDetailsRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetPlaceDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlaceDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReverseGeocode(com.eventsease.v1.GetReverseGeocodeRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.GetReverseGeocodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReverseGeocodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchPlaces(com.eventsease.v1.SearchPlacesRequest request,
        io.grpc.stub.StreamObserver<com.eventsease.v1.SearchPlacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchPlacesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LocationService.
   */
  public static final class LocationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LocationServiceBlockingStub> {
    private LocationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.eventsease.v1.GetPlaceDetailsResponse getPlaceDetails(com.eventsease.v1.GetPlaceDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlaceDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eventsease.v1.GetReverseGeocodeResponse getReverseGeocode(com.eventsease.v1.GetReverseGeocodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReverseGeocodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eventsease.v1.SearchPlacesResponse searchPlaces(com.eventsease.v1.SearchPlacesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchPlacesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LocationService.
   */
  public static final class LocationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LocationServiceFutureStub> {
    private LocationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventsease.v1.GetPlaceDetailsResponse> getPlaceDetails(
        com.eventsease.v1.GetPlaceDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlaceDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventsease.v1.GetReverseGeocodeResponse> getReverseGeocode(
        com.eventsease.v1.GetReverseGeocodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReverseGeocodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventsease.v1.SearchPlacesResponse> searchPlaces(
        com.eventsease.v1.SearchPlacesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchPlacesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PLACE_DETAILS = 0;
  private static final int METHODID_GET_REVERSE_GEOCODE = 1;
  private static final int METHODID_SEARCH_PLACES = 2;

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
        case METHODID_GET_PLACE_DETAILS:
          serviceImpl.getPlaceDetails((com.eventsease.v1.GetPlaceDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.eventsease.v1.GetPlaceDetailsResponse>) responseObserver);
          break;
        case METHODID_GET_REVERSE_GEOCODE:
          serviceImpl.getReverseGeocode((com.eventsease.v1.GetReverseGeocodeRequest) request,
              (io.grpc.stub.StreamObserver<com.eventsease.v1.GetReverseGeocodeResponse>) responseObserver);
          break;
        case METHODID_SEARCH_PLACES:
          serviceImpl.searchPlaces((com.eventsease.v1.SearchPlacesRequest) request,
              (io.grpc.stub.StreamObserver<com.eventsease.v1.SearchPlacesResponse>) responseObserver);
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
          getGetPlaceDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.eventsease.v1.GetPlaceDetailsRequest,
              com.eventsease.v1.GetPlaceDetailsResponse>(
                service, METHODID_GET_PLACE_DETAILS)))
        .addMethod(
          getGetReverseGeocodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.eventsease.v1.GetReverseGeocodeRequest,
              com.eventsease.v1.GetReverseGeocodeResponse>(
                service, METHODID_GET_REVERSE_GEOCODE)))
        .addMethod(
          getSearchPlacesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.eventsease.v1.SearchPlacesRequest,
              com.eventsease.v1.SearchPlacesResponse>(
                service, METHODID_SEARCH_PLACES)))
        .build();
  }

  private static abstract class LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.eventsease.v1.LocationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocationService");
    }
  }

  private static final class LocationServiceFileDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier {
    LocationServiceFileDescriptorSupplier() {}
  }

  private static final class LocationServiceMethodDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LocationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LocationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocationServiceFileDescriptorSupplier())
              .addMethod(getGetPlaceDetailsMethod())
              .addMethod(getGetReverseGeocodeMethod())
              .addMethod(getSearchPlacesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
