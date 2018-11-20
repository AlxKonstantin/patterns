package aircraft;

/**
 * Class Laser.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class Laser implements ShootBehavior {

    @Override
    public void shoot() {
        System.out.println("Laser shot");
    }
}
