package simplefactory;


import simplefactory.pizzas.*;

/**
 * Class SimplePizzaFactory.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 23.01.2018.
 */
public class SimplePizzaFactory {
     public Pizza createPizza(String type) {
         Pizza pizza = null;

         if (type.equals("cheese")) {
             pizza = new CheesePizza();
         } else if (type.equals("pepperoni")) {
             pizza = new PepperoniPizza();
         } else if (type.equals("clam")) {
             pizza = new ClamPizza();
         } else if (type.equals("veggie")) {
             pizza = new VeggiePizza();
         }

         return pizza;
     }
}