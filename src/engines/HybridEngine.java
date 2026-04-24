package engines;

public class HybridEngine implements Engine {
    private Engine electricEngine;
    private Engine gasolineEngine;
    private int currentSpeed = 0;

    public HybridEngine() {
        this.electricEngine = new ElectricEngine();
        this.gasolineEngine = new GasEngine();
    }

    public void routeEngine() {
        if (currentSpeed < 50) {
            electricEngine.setSpeed(currentSpeed);
            electricEngine.increase();

        } else {
            gasolineEngine.setSpeed(currentSpeed);
            gasolineEngine.increase();
        }
    }

    @Override
    public void increase() {
        currentSpeed += 1;
        routeEngine();
    }

    @Override
    public void decrease() {
        if (currentSpeed > 0) {
            currentSpeed -= 1;

        }
        routeEngine();
    }

    @Override
    public void setSpeed(int speed) {
        this.currentSpeed = speed;
        routeEngine();
    }
}