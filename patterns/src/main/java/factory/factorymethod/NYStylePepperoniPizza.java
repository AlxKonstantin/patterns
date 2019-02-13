package factory.factorymethod;

/**
 * Class NYStylePepperoniPizza.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 23.01.2018.
 */
public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "some special name for the pizza";
        dough = "some special dough for the pizza";
        sauce = "some special sauce for the pizza";

        toppings.add("some special topping for the pizza");
    }

}
