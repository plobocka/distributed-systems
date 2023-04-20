package org.example.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: GrpcInterface.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GrpcServiceGrpc {

  private GrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "GrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.model.Car,
      org.example.model.TheResponse> getAddProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addProcedure",
      requestType = org.example.model.Car.class,
      responseType = org.example.model.TheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.model.Car,
      org.example.model.TheResponse> getAddProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.Car, org.example.model.TheResponse> getAddProcedureMethod;
    if ((getAddProcedureMethod = GrpcServiceGrpc.getAddProcedureMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getAddProcedureMethod = GrpcServiceGrpc.getAddProcedureMethod) == null) {
          GrpcServiceGrpc.getAddProcedureMethod = getAddProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.Car, org.example.model.TheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.Car.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("addProcedure"))
              .build();
        }
      }
    }
    return getAddProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.NameRequest,
      org.example.model.TheResponse> getRemoveProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeProcedure",
      requestType = org.example.model.NameRequest.class,
      responseType = org.example.model.TheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.model.NameRequest,
      org.example.model.TheResponse> getRemoveProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.NameRequest, org.example.model.TheResponse> getRemoveProcedureMethod;
    if ((getRemoveProcedureMethod = GrpcServiceGrpc.getRemoveProcedureMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getRemoveProcedureMethod = GrpcServiceGrpc.getRemoveProcedureMethod) == null) {
          GrpcServiceGrpc.getRemoveProcedureMethod = getRemoveProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.NameRequest, org.example.model.TheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.NameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("removeProcedure"))
              .build();
        }
      }
    }
    return getRemoveProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.GetAllRequest,
      org.example.model.Car> getGetAllProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllProcedure",
      requestType = org.example.model.GetAllRequest.class,
      responseType = org.example.model.Car.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.GetAllRequest,
      org.example.model.Car> getGetAllProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.GetAllRequest, org.example.model.Car> getGetAllProcedureMethod;
    if ((getGetAllProcedureMethod = GrpcServiceGrpc.getGetAllProcedureMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getGetAllProcedureMethod = GrpcServiceGrpc.getGetAllProcedureMethod) == null) {
          GrpcServiceGrpc.getGetAllProcedureMethod = getGetAllProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.GetAllRequest, org.example.model.Car>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.Car.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("getAllProcedure"))
              .build();
        }
      }
    }
    return getGetAllProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.NameRequest,
      org.example.model.Car> getGetProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProcedure",
      requestType = org.example.model.NameRequest.class,
      responseType = org.example.model.Car.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.model.NameRequest,
      org.example.model.Car> getGetProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.NameRequest, org.example.model.Car> getGetProcedureMethod;
    if ((getGetProcedureMethod = GrpcServiceGrpc.getGetProcedureMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getGetProcedureMethod = GrpcServiceGrpc.getGetProcedureMethod) == null) {
          GrpcServiceGrpc.getGetProcedureMethod = getGetProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.NameRequest, org.example.model.Car>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.NameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.Car.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("getProcedure"))
              .build();
        }
      }
    }
    return getGetProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.NameRequest,
      org.example.model.Photo> getGetPhotoProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPhotoProcedure",
      requestType = org.example.model.NameRequest.class,
      responseType = org.example.model.Photo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.NameRequest,
      org.example.model.Photo> getGetPhotoProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.NameRequest, org.example.model.Photo> getGetPhotoProcedureMethod;
    if ((getGetPhotoProcedureMethod = GrpcServiceGrpc.getGetPhotoProcedureMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getGetPhotoProcedureMethod = GrpcServiceGrpc.getGetPhotoProcedureMethod) == null) {
          GrpcServiceGrpc.getGetPhotoProcedureMethod = getGetPhotoProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.NameRequest, org.example.model.Photo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPhotoProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.NameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.Photo.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("getPhotoProcedure"))
              .build();
        }
      }
    }
    return getGetPhotoProcedureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceStub>() {
        @java.lang.Override
        public GrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceStub(channel, callOptions);
        }
      };
    return GrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceBlockingStub>() {
        @java.lang.Override
        public GrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return GrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceFutureStub>() {
        @java.lang.Override
        public GrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceFutureStub(channel, callOptions);
        }
      };
    return GrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addProcedure(org.example.model.Car request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProcedureMethod(), responseObserver);
    }

    /**
     */
    public void removeProcedure(org.example.model.NameRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveProcedureMethod(), responseObserver);
    }

    /**
     */
    public void getAllProcedure(org.example.model.GetAllRequest request,
        io.grpc.stub.StreamObserver<org.example.model.Car> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllProcedureMethod(), responseObserver);
    }

    /**
     */
    public void getProcedure(org.example.model.NameRequest request,
        io.grpc.stub.StreamObserver<org.example.model.Car> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProcedureMethod(), responseObserver);
    }

    /**
     */
    public void getPhotoProcedure(org.example.model.NameRequest request,
        io.grpc.stub.StreamObserver<org.example.model.Photo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPhotoProcedureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.model.Car,
                org.example.model.TheResponse>(
                  this, METHODID_ADD_PROCEDURE)))
          .addMethod(
            getRemoveProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.model.NameRequest,
                org.example.model.TheResponse>(
                  this, METHODID_REMOVE_PROCEDURE)))
          .addMethod(
            getGetAllProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.GetAllRequest,
                org.example.model.Car>(
                  this, METHODID_GET_ALL_PROCEDURE)))
          .addMethod(
            getGetProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.model.NameRequest,
                org.example.model.Car>(
                  this, METHODID_GET_PROCEDURE)))
          .addMethod(
            getGetPhotoProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.NameRequest,
                org.example.model.Photo>(
                  this, METHODID_GET_PHOTO_PROCEDURE)))
          .build();
    }
  }

  /**
   */
  public static final class GrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<GrpcServiceStub> {
    private GrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void addProcedure(org.example.model.Car request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeProcedure(org.example.model.NameRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllProcedure(org.example.model.GetAllRequest request,
        io.grpc.stub.StreamObserver<org.example.model.Car> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProcedure(org.example.model.NameRequest request,
        io.grpc.stub.StreamObserver<org.example.model.Car> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPhotoProcedure(org.example.model.NameRequest request,
        io.grpc.stub.StreamObserver<org.example.model.Photo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetPhotoProcedureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrpcServiceBlockingStub> {
    private GrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.model.TheResponse addProcedure(org.example.model.Car request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.model.TheResponse removeProcedure(org.example.model.NameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.Car> getAllProcedure(
        org.example.model.GetAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.model.Car getProcedure(org.example.model.NameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.Photo> getPhotoProcedure(
        org.example.model.NameRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetPhotoProcedureMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GrpcServiceFutureStub> {
    private GrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.model.TheResponse> addProcedure(
        org.example.model.Car request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProcedureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.model.TheResponse> removeProcedure(
        org.example.model.NameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveProcedureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.model.Car> getProcedure(
        org.example.model.NameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProcedureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PROCEDURE = 0;
  private static final int METHODID_REMOVE_PROCEDURE = 1;
  private static final int METHODID_GET_ALL_PROCEDURE = 2;
  private static final int METHODID_GET_PROCEDURE = 3;
  private static final int METHODID_GET_PHOTO_PROCEDURE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PROCEDURE:
          serviceImpl.addProcedure((org.example.model.Car) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PROCEDURE:
          serviceImpl.removeProcedure((org.example.model.NameRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_PROCEDURE:
          serviceImpl.getAllProcedure((org.example.model.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.Car>) responseObserver);
          break;
        case METHODID_GET_PROCEDURE:
          serviceImpl.getProcedure((org.example.model.NameRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.Car>) responseObserver);
          break;
        case METHODID_GET_PHOTO_PROCEDURE:
          serviceImpl.getPhotoProcedure((org.example.model.NameRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.Photo>) responseObserver);
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

  private static abstract class GrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.model.GrpcAppProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcService");
    }
  }

  private static final class GrpcServiceFileDescriptorSupplier
      extends GrpcServiceBaseDescriptorSupplier {
    GrpcServiceFileDescriptorSupplier() {}
  }

  private static final class GrpcServiceMethodDescriptorSupplier
      extends GrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcServiceFileDescriptorSupplier())
              .addMethod(getAddProcedureMethod())
              .addMethod(getRemoveProcedureMethod())
              .addMethod(getGetAllProcedureMethod())
              .addMethod(getGetProcedureMethod())
              .addMethod(getGetPhotoProcedureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
