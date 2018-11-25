package strategy;

/**
 * Class Shoot.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class Shoot implements ShootBehavior {

    @Override
    public void shoot() {
        System.out.println("Bang");
    }
}
