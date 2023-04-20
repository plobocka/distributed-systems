package org.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.model.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GrpcClient {
  private static final String ADDRESS = "localhost";
  private static final int PORT = 50051;
  private static final ManagedChannel channel = ManagedChannelBuilder.forAddress(ADDRESS, PORT).usePlaintext().build();

  public static void main(String[] args) {
    System.out.println("Client started");
    GrpcServiceGrpc.GrpcServiceBlockingStub stub = GrpcServiceGrpc.newBlockingStub(channel);
    stub.addProcedure(Car.newBuilder().setName("Mercedes").setYear(2012).build());
    stub.addProcedure(Car.newBuilder().setName("Audi").setYear(2013).build());
    stub.addProcedure(Car.newBuilder().setName("Volvo").setYear(2023).build());
    System.out.println("Data initialized");


    System.out.println("What do you want to do?");
    System.out.println("1. Add new car");
    System.out.println("2. Get all cars");
    System.out.println("3. Get car year by name");
    System.out.println("4. Remove car by name");
    System.out.println("5. Shutdown");
    int choice = 0;
    Scanner scanner = new Scanner(System.in);
    choice = scanner.nextInt();
    while (choice != 5) {
      System.out.println("What do you want to do next?");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter car name");
          String name = scanner.next();
          System.out.println("Enter car year");
          int year = scanner.nextInt();
          stub.addProcedure(Car.newBuilder().setName(name).setYear(year).build());
          break;
        case 2:
          getAllCars(stub);
          break;
        case 3:
          System.out.println("Enter car name");
          String name1 = scanner.next();
          getCar(name1);
          break;
        case 4:
            System.out.println("Enter car name");
            String name2 = scanner.next();
            removeCar(name2);
            break;
        default:
          System.out.println("Wrong choice");
          break;
      }
    }
    getAllCars(stub);

    stub.addProcedure(Car.newBuilder().setName("Jeep").setYear(2015).build());

    getAllCars(stub);

    System.out.println("Asking for Mercedes data (year)");
    getCar("Mercedes");

    System.out.println("Removing Audi");
    removeCar("Audi");

    getAllCars(stub);
  }

  private static void getCar(String name) {
    GrpcServiceGrpc.GrpcServiceBlockingStub stub = GrpcServiceGrpc.newBlockingStub(channel);
    System.out.println("Asking for " + name + " data (year)");
    Car car = stub.getProcedure(NameRequest.newBuilder().setName(name).build());
    System.out.println(car.getYear());
  }

  private static void getAllCars(GrpcServiceGrpc.GrpcServiceBlockingStub stub) {
    System.out.println("Calling blocking procedure getAllProcedure...");
    Iterator<Car> iterator = stub.getAllProcedure(GetAllRequest.newBuilder().build());
    Car carToShow;
    while (iterator.hasNext()) {
      carToShow = iterator.next();
      System.out.println(carToShow.getName());
    }
  }

  private static void removeCar(String name) {
    GrpcServiceGrpc.GrpcServiceBlockingStub stub = GrpcServiceGrpc.newBlockingStub(channel);
    System.out.println("Calling blocking procedure removeProcedure...");
    stub.removeProcedure(NameRequest.newBuilder().setName(name).build());
  }

  private static class CarObservator implements StreamObserver<Car> {
    public void onNext(Car car) {
      System.out.println(car.getName() + " " + car.getYear());
    }
    public void onError(Throwable throwable) {
      System.out.println("Error");
    }
    public void onCompleted() {
      System.out.println("...onCompleted");
    }
  }
}
