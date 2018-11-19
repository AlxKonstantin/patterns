package ducks;

/**
 * Created by Home on 04.01.2018.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
