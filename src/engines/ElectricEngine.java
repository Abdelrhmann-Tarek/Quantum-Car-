package engines;

public class ElectricEngine implements Engine {
    private int speed = 0;

    @Override
    public void increase() {
        speed++;
        // System.out.println("Electric Engine speed increased to: " + speed);
        // m
    }

    @Override
    public void decrease() {
        if (speed > 0) {
            speed -= 1;
            // System.out.println("Electric Engine speed decreased to: " + speed);
        } else {
            System.out.println("Electric Engine is already at minimum speed.");
        }
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Electric Engine speed set to: " + this.speed);
    }

}