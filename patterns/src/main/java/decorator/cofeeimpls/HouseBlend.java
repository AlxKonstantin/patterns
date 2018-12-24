package decorator.cofeeimpls;

import decorator.Beverage;

/**
 * Class HouseBlend.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
