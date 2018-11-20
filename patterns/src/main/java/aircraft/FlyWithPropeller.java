package aircraft;

/**
 * Class FlyWithPropeller.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class FlyWithPropeller implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I`m flying!!");
    }
}
