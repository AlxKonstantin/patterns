package ducks;

/**
 * Created by Home on 04.01.2018.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I`m a real Mallard duck");
    }
}
