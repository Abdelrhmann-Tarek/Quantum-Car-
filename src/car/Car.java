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

    public void stop() {
        speed = 0;
        engine.setSpeed(speed);
        System.out.println("Car stopped.");
    }

    public void accelerate() {
        if (speed < 200) {
            engine.setSpeed(speed);
            for (int i = 0; i < 20; i++) {
                engine.increase();
            }
            System.out.println("Car accelerated to: " + speed);
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 20;
            if (speed < 0)
                speed = 0;

            engine.setSpeed(speed);
            engine.decrease();

            System.out.println("Car slowed to: " + speed);
        }
    }

    public void changeEngine(Engine newEngine) {
        this.engine = newEngine;
        this.engine.setSpeed(speed);
        System.out.println("Engine replaced!");
    }

}
