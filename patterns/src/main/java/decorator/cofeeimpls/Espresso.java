package decorator.cofeeimpls;

import decorator.Beverage;

/**
 * Class Espresso.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
