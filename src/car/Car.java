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
        int acc = 20;

        for (int i = 0; i < acc; i++) {
            engine.increase();
        }

        engine.setSpeed(speed);
        System.out.println("Car accelerated to: " + speed);

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
