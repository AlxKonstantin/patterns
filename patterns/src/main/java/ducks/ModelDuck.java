package ducks;

/**
 * Created by Home on 04.01.2018.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I`m a model duck");
    }
}
