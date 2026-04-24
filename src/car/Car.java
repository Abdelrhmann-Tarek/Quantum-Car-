package car;

import engines.Engine;

public class Car {
    private Engine engine;
    private int speed = 0;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        speed = 0;
        engine.setSpeed(speed);
        System.out.println("Car started at speed : " + speed);

    }

}
