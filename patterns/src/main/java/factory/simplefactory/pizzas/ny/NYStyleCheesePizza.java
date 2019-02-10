package factory.simplefactory.pizzas.ny;

import factory.simplefactory.pizzas.Pizza;

/**
 * Class NYStyleCheesePizza.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 23.01.2018.
 */
public class NYStyleCheesePizza implements Pizza {

    public NYStyleCheesePizza() {
        System.out.println("NYStyleCheesePizza");
    }

    @Override
    public void prepare() {
        System.out.println("prepare");
    }

    @Override
    public void bake() {
        System.out.println("bake");
    }

    @Override
    public void cut() {
        System.out.println("cut");
    }

    @Override
    public void box() {
        System.out.println("box");
    }

    @Override
    public void pizza() {
        System.out.println("pizza");
    }
}
