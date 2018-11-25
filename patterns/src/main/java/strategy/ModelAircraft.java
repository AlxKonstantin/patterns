package strategy;

/**
 * Class ModelAircraft.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class ModelAircraft extends Aircraft {

    /**
     * Class constructor.
     */
    public ModelAircraft() {
        flyBehavior = new FlyWithPropeller();
        shootBehavior = new BlankShot();
    }

    @Override
    public void display() {
        System.out.println("I`m a model aircraft");
    }
}
