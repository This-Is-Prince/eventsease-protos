package com.eventsease.v1

import com.eventsease.v1.EventServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for eventsease.v1.EventService.
 */
public object EventServiceGrpcKt {
  public const val SERVICE_NAME: String = EventServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getEventsMethod: MethodDescriptor<GetEventsRequest, GetEventsResponse>
    @JvmStatic
    get() = EventServiceGrpc.getGetEventsMethod()

  public val getEventMethod: MethodDescriptor<GetEventRequest, GetEventResponse>
    @JvmStatic
    get() = EventServiceGrpc.getGetEventMethod()

  public val getEventStatsMethod: MethodDescriptor<GetEventStatsRequest, GetEventStatsResponse>
    @JvmStatic
    get() = EventServiceGrpc.getGetEventStatsMethod()

  public val createEventMethod: MethodDescriptor<CreateEventRequest, CreateEventResponse>
    @JvmStatic
    get() = EventServiceGrpc.getCreateEventMethod()

  public val getUserEventsMethod: MethodDescriptor<GetUserEventsRequest, GetEventsResponse>
    @JvmStatic
    get() = EventServiceGrpc.getGetUserEventsMethod()

  public val getSavedEventsMethod: MethodDescriptor<GetUserEventsRequest, GetEventsResponse>
    @JvmStatic
    get() = EventServiceGrpc.getGetSavedEventsMethod()

  public val toggleSavedEventMethod:
      MethodDescriptor<ToggleSavedEventRequest, ToggleSavedEventResponse>
    @JvmStatic
    get() = EventServiceGrpc.getToggleSavedEventMethod()

  /**
   * A stub for issuing RPCs to a(n) eventsease.v1.EventService service as suspending coroutines.
   */
  @StubFor(EventServiceGrpc::class)
  public class EventServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<EventServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): EventServiceCoroutineStub =
        EventServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getEvents(request: GetEventsRequest, headers: Metadata = Metadata()):
        GetEventsResponse = unaryRpc(
      channel,
      EventServiceGrpc.getGetEventsMethod(),
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
    public suspend fun getEvent(request: GetEventRequest, headers: Metadata = Metadata()):
        GetEventResponse = unaryRpc(
      channel,
      EventServiceGrpc.getGetEventMethod(),
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
    public suspend fun getEventStats(request: GetEventStatsRequest, headers: Metadata = Metadata()):
        GetEventStatsResponse = unaryRpc(
      channel,
      EventServiceGrpc.getGetEventStatsMethod(),
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
    public suspend fun createEvent(request: CreateEventRequest, headers: Metadata = Metadata()):
        CreateEventResponse = unaryRpc(
      channel,
      EventServiceGrpc.getCreateEventMethod(),
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
    public suspend fun getUserEvents(request: GetUserEventsRequest, headers: Metadata = Metadata()):
        GetEventsResponse = unaryRpc(
      channel,
      EventServiceGrpc.getGetUserEventsMethod(),
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
    public suspend fun getSavedEvents(request: GetUserEventsRequest, headers: Metadata =
        Metadata()): GetEventsResponse = unaryRpc(
      channel,
      EventServiceGrpc.getGetSavedEventsMethod(),
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
    public suspend fun toggleSavedEvent(request: ToggleSavedEventRequest, headers: Metadata =
        Metadata()): ToggleSavedEventResponse = unaryRpc(
      channel,
      EventServiceGrpc.getToggleSavedEventMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the eventsease.v1.EventService service based on Kotlin coroutines.
   */
  public abstract class EventServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for eventsease.v1.EventService.GetEvents.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getEvents(request: GetEventsRequest): GetEventsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.EventService.GetEvents is unimplemented"))

    /**
     * Returns the response to an RPC for eventsease.v1.EventService.GetEvent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getEvent(request: GetEventRequest): GetEventResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.EventService.GetEvent is unimplemented"))

    /**
     * Returns the response to an RPC for eventsease.v1.EventService.GetEventStats.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getEventStats(request: GetEventStatsRequest): GetEventStatsResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.EventService.GetEventStats is unimplemented"))

    /**
     * Returns the response to an RPC for eventsease.v1.EventService.CreateEvent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createEvent(request: CreateEventRequest): CreateEventResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.EventService.CreateEvent is unimplemented"))

    /**
     * Returns the response to an RPC for eventsease.v1.EventService.GetUserEvents.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getUserEvents(request: GetUserEventsRequest): GetEventsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.EventService.GetUserEvents is unimplemented"))

    /**
     * Returns the response to an RPC for eventsease.v1.EventService.GetSavedEvents.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getSavedEvents(request: GetUserEventsRequest): GetEventsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.EventService.GetSavedEvents is unimplemented"))

    /**
     * Returns the response to an RPC for eventsease.v1.EventService.ToggleSavedEvent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun toggleSavedEvent(request: ToggleSavedEventRequest):
        ToggleSavedEventResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.EventService.ToggleSavedEvent is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getGetEventsMethod(),
      implementation = ::getEvents
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getGetEventMethod(),
      implementation = ::getEvent
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getGetEventStatsMethod(),
      implementation = ::getEventStats
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getCreateEventMethod(),
      implementation = ::createEvent
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getGetUserEventsMethod(),
      implementation = ::getUserEvents
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getGetSavedEventsMethod(),
      implementation = ::getSavedEvents
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getToggleSavedEventMethod(),
      implementation = ::toggleSavedEvent
    )).build()
  }
}
