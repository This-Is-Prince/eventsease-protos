package com.eventsease.v1

import com.eventsease.v1.UserServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for eventsease.v1.UserService.
 */
public object UserServiceGrpcKt {
  public const val SERVICE_NAME: String = UserServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val checkUserMethod: MethodDescriptor<CheckUserRequest, CheckUserResponse>
    @JvmStatic
    get() = UserServiceGrpc.getCheckUserMethod()

  public val registerFCMMethod: MethodDescriptor<RegisterFCMRequest, RegisterFCMResponse>
    @JvmStatic
    get() = UserServiceGrpc.getRegisterFCMMethod()

  /**
   * A stub for issuing RPCs to a(n) eventsease.v1.UserService service as suspending coroutines.
   */
  @StubFor(UserServiceGrpc::class)
  public class UserServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<UserServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): UserServiceCoroutineStub =
        UserServiceCoroutineStub(channel, callOptions)

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
    public suspend fun checkUser(request: CheckUserRequest, headers: Metadata = Metadata()):
        CheckUserResponse = unaryRpc(
      channel,
      UserServiceGrpc.getCheckUserMethod(),
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
    public suspend fun registerFCM(request: RegisterFCMRequest, headers: Metadata = Metadata()):
        RegisterFCMResponse = unaryRpc(
      channel,
      UserServiceGrpc.getRegisterFCMMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the eventsease.v1.UserService service based on Kotlin coroutines.
   */
  public abstract class UserServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for eventsease.v1.UserService.CheckUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun checkUser(request: CheckUserRequest): CheckUserResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.UserService.CheckUser is unimplemented"))

    /**
     * Returns the response to an RPC for eventsease.v1.UserService.RegisterFCM.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun registerFCM(request: RegisterFCMRequest): RegisterFCMResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method eventsease.v1.UserService.RegisterFCM is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getCheckUserMethod(),
      implementation = ::checkUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getRegisterFCMMethod(),
      implementation = ::registerFCM
    )).build()
  }
}
