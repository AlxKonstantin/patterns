package decorator.condiments;

import decorator.Beverage;
import decorator.CondimentDecorator;

/**
 * Class Whip.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Whip";
    }

    @Override
    public double cost() {
        return .25 + beverage.cost();
    }
}
