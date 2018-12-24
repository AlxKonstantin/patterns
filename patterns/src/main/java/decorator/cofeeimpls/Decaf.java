package decorator.cofeeimpls;

import decorator.Beverage;

/**
 * Class Decaf.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return .79;
    }
}
