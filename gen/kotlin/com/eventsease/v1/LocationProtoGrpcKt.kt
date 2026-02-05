package com.eventsease.v1

import com.eventsease.v1.LocationServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for eventsease.v1.LocationService.
 */
public object LocationServiceGrpcKt {
  public const val SERVICE_NAME: String = LocationServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getPlaceDetailsMethod:
      MethodDescriptor<GetPlaceDetailsRequest, GetPlaceDetailsResponse>
    @JvmStatic
    get() = LocationServiceGrpc.getGetPlaceDetailsMethod()

  public val getReverseGeocodeMethod:
      MethodDescriptor<GetReverseGeocodeRequest, GetReverseGeocodeResponse>
    @JvmStatic
    get() = LocationServiceGrpc.getGetReverseGeocodeMethod()

  public val searchPlacesMethod: MethodDescriptor<SearchPlacesRequest, SearchPlacesResponse>
    @JvmStatic
    get() = LocationServiceGrpc.getSearchPlacesMethod()

  /**
   * A stub for issuing RPCs to a(n) eventsease.v1.LocationService service as suspending coroutines.
   */
  @StubFor(LocationServiceGrpc::class)
  public class LocationServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<LocationServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): LocationServiceCoroutineStub =
        LocationServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getPlaceDetails(request: GetPlaceDetailsRequest, headers: Metadata =
        Metadata()): GetPlaceDetailsResponse = unaryRpc(
      channel,
      LocationServiceGrpc.getGetPlaceDetailsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getReverseGeocode(request: GetReverseGeocodeRequest, headers: Metadata =
        Metadata()): GetReverseGeocodeResponse = unaryRpc(
      channel,
      LocationServiceGrpc.getGetReverseGeocodeMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchPlaces(request: SearchPlacesRequest, headers: Metadata = Metadata()):
        SearchPlacesResponse = unaryRpc(
      channel,
      LocationServiceGrpc.getSearchPlacesMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the eventsease.v1.LocationService service based on Kotlin
   * coroutines.
   */
  public abstract class LocationServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for eventsease.v1.LocationService.GetPlaceDetails.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getPlaceDetails(request: GetPlaceDetailsRequest):
        GetPlaceDetailsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.LocationService.GetPlaceDetails is unimplemented"))

    /**
     * Returns the response to an RPC for eventsease.v1.LocationService.GetReverseGeocode.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getReverseGeocode(request: GetReverseGeocodeRequest):
        GetReverseGeocodeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.LocationService.GetReverseGeocode is unimplemented"))

    /**
     * Returns the response to an RPC for eventsease.v1.LocationService.SearchPlaces.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchPlaces(request: SearchPlacesRequest): SearchPlacesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.LocationService.SearchPlaces is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LocationServiceGrpc.getGetPlaceDetailsMethod(),
      implementation = ::getPlaceDetails
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LocationServiceGrpc.getGetReverseGeocodeMethod(),
      implementation = ::getReverseGeocode
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LocationServiceGrpc.getSearchPlacesMethod(),
      implementation = ::searchPlaces
    )).build()
  }
}
