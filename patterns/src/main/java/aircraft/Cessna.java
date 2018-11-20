package aircraft;

/**
 * Class Cessna.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class Cessna extends Aircraft {

    /**
     * Class constructor.
     */
    public Cessna() {
        flyBehavior = new FlyWithPropeller();
        shootBehavior = new Shoot();
    }

    @Override
    public void display() {
        System.out.println("I`m a real Cessna");
    }
}
