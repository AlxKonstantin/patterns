package factory.simplefactory;

import factory.simplefactory.pizzas.Pizza;

/**
 * Class PizzaStore.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 23.01.2018.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.pizza();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
