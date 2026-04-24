package engines;

public class GasEngine implements Engine {
    private int speed = 0;

    @Override
    public void increase() {
        speed += 1;
        System.out.println("Gasoline engine speed increased to " + speed);
    }

    @Override
    public void decrease() {
        if (speed > 0) {
            speed -= 1;
            System.out.println("Gasoline engine speed decreased to " + speed);
        } else {
            System.out.println("Gasoline engine is already at minimum speed.");

        }
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Gasoline engine speed set to " + this.speed);
    }

}
