package org.example;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.example.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GrpcServer {
  private static final int PORT = 50051;

  public static void main(String[] args) {
    Server server = ServerBuilder.forPort(PORT).addService(new GrpcServiceImpl()).build();
    try {
      server.start();
        System.out.println("Server started");
        server.awaitTermination();
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }

  static class GrpcServiceImpl extends GrpcServiceGrpc.GrpcServiceImplBase {
    public static List<Car> list = new ArrayList<>();
//    public static List<Photo> photos = new ArrayList<>();

    @Override
    public void getAllProcedure(GetAllRequest request, StreamObserver<Car> responseObserver) {
      System.out.println("...called getAllProcedure");
      for (Car car : list) {
        responseObserver.onNext(car);
      }
      responseObserver.onCompleted();
    }

    @Override
    public void addProcedure(Car request, StreamObserver<TheResponse> responseObserver) {
        System.out.println("...called addProcedure");
        list.add(request);
        TheResponse response = TheResponse.newBuilder().setMessage("Added successfully").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getProcedure(NameRequest request, StreamObserver<Car> responseObserver) {
      System.out.println("...called getProcedure");
      for (Car car : list) {
        if (car.getName().equals(request.getName())) {
          responseObserver.onNext(car);
        }
      }
      responseObserver.onCompleted();
    }

    @Override
    public void removeProcedure(NameRequest request, StreamObserver<TheResponse> responseObserver) {
      System.out.println("...called removeProcedure");
      list.stream().filter(car -> car.getName().equals(request.getName())).findFirst().ifPresent(list::remove);
        TheResponse response = TheResponse.newBuilder().setMessage("Removed successfully").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
  }
}
