package factory.simplefactory.pizzas.anywhere;

import factory.simplefactory.pizzas.Pizza;

/**
 * Class CheesePizza.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 23.01.2018.
 */
public class CheesePizza implements Pizza {

    public CheesePizza() {
        System.out.println("CheesePizza");
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
