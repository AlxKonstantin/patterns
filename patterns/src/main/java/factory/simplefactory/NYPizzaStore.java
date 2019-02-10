package factory.simplefactory;

import factory.simplefactory.pizzas.*;
import factory.simplefactory.pizzas.ny.NYStyleCheesePizza;
import factory.simplefactory.pizzas.ny.NYStyleClamPizza;
import factory.simplefactory.pizzas.ny.NYStylePepperoniPizza;
import factory.simplefactory.pizzas.ny.NYStyleVeggiePizza;

/**
 * Class NYPizzaStore.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 10.02.2018.
 */
public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
