package strategy;

/**
 * Abstract class Aircraft.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public abstract class Aircraft {

    /**
     * @param flyBehavior - FlyBehavior variable.
     */
    FlyBehavior flyBehavior;

    /**
     * @param shootBehavior - ShootBehavior variable.
     */
    ShootBehavior shootBehavior;

    /**
     * Class constructor.
     */
    public Aircraft() {
    }

    /**
     * Method display - shows aircraft.
     */
    public abstract void display();

    /**
     * Method performFly - performs fly.
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * Method performShoot - performs shoot.
     */
    public void performShoot() {
        shootBehavior.shoot();
    }

    /**
     * Method drive - performs drive.
     */
    public void drive() {
        System.out.println("All aircraft can drive, even toys!");
    }

    /**
     * Method setFlyBehavior - FlyBehavior setter.
     *
     * @param fb - FlyBehavior variable.
     */
    public void setFlyBehavior (FlyBehavior fb) {
        flyBehavior = fb;
    }

    /**
     * Method setShootBehavior - ShootBehavior setter.
     *
     * @param sb - ShootBehavior variable.
     */
    public void setShootBehavior(ShootBehavior sb) {
        shootBehavior = sb;
    }
}
