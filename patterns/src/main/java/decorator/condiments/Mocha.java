package decorator.condiments;

import decorator.Beverage;
import decorator.CondimentDecorator;

/**
 * Class Mocha.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
