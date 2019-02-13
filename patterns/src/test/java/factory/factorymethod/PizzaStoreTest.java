package factory.factorymethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaStoreTest {

    @Test
    public void whenCookAPizzaThenHasToReturnParticularLocationPizza() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());

    }

}