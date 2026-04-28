// package src;

import car.Car;
import factory.CarFactory;

public class App {

    public static void main(String[] args) {

        // Create Cars
        Car gasCar = CarFactory.createCar("gas");
        Car electricCar = CarFactory.createCar("electric");
        Car hybridCar = CarFactory.createCar("hybrid");

        System.out.println("\n--- GAS CAR TEST ---");
        gasCar.start();
        gasCar.accelerate();
        gasCar.accelerate();
        gasCar.brake();
        gasCar.stop();

        System.out.println("\n--- ELECTRIC CAR TEST ---");
        electricCar.start();
        electricCar.accelerate();
        electricCar.stop();

        System.out.println("\n--- HYBRID CAR TEST ---");
        hybridCar.start();
        hybridCar.accelerate();
        hybridCar.accelerate();
        hybridCar.accelerate();
        hybridCar.brake();
        hybridCar.stop();
        // the acc error happen here

        System.out.println("\n--- ENGINE REPLACEMENT TEST ---");
        Car car = CarFactory.createCar("gas");
        car.start();
        CarFactory.replaceEngine(car, "electric");
        car.accelerate();
    }
}