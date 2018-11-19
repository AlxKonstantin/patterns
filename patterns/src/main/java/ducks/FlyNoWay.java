package ducks;

/**
 * Created by Home on 04.01.2018.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can`t fly");
    }
}
