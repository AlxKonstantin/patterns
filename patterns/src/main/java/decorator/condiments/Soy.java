package decorator.condiments;

import decorator.Beverage;
import decorator.CondimentDecorator;

/**
 * Class Soy.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
