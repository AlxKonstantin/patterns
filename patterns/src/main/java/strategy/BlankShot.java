package strategy;

/**
 * Class BlankShot.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class BlankShot implements ShootBehavior {

    @Override
    public void shoot() {
        System.out.println("<< Pooooof >>");
    }
}
