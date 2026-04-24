package factory;

import car.Car;
import engines.*;

public class CarFactory {

    public static Car createCar(String type) {

        switch (type.toLowerCase()) {

            case "gas":
                return new Car(new GasEngine());

            case "electric":
                return new Car(new ElectricEngine());

            case "hybrid":
                return new Car(new HybridEngine());

            default:
                throw new IllegalArgumentException("Unknown engine type");
        }
    }

    public static void replaceEngine(Car car, String type) {

        switch (type.toLowerCase()) {

            case "gas":
                car.changeEngine(new GasEngine());
                break;

            case "electric":
                car.changeEngine(new ElectricEngine());
                break;

            case "hybrid":
                car.changeEngine(new HybridEngine());
                break;

            default:
                throw new IllegalArgumentException("Unknown engine type");
        }
    }
}
