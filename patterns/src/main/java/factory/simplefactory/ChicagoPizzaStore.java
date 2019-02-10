package factory.simplefactory;

import factory.simplefactory.pizzas.Pizza;
import factory.simplefactory.pizzas.chicago.ChicagoStyleCheesePizza;
import factory.simplefactory.pizzas.chicago.ChicagoStyleClamPizza;
import factory.simplefactory.pizzas.chicago.ChicagoStylePepperoniPizza;
import factory.simplefactory.pizzas.chicago.ChicagoStyleVeggiePizza;

/**
 * Class ChicagoPizzaStore.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 10.02.2018.
 */
public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
