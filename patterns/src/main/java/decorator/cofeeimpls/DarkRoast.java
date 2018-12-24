package decorator.cofeeimpls;

import decorator.Beverage;

/**
 * Class DarkRoast.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
