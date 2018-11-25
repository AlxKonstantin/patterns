package strategy;

/**
 * Class FlyRocketPowered.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I`m flying with a rocket engine!");
    }
}
