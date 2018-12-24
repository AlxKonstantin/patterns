package decorator;

import decorator.cofeeimpls.DarkRoast;
import decorator.cofeeimpls.Espresso;
import decorator.cofeeimpls.HouseBlend;
import decorator.condiments.Mocha;
import decorator.condiments.Soy;
import decorator.condiments.Whip;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class DecoratorTest.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class DecoratorTest {

    @Test
    public void whenOrderAnEspressoThenHasToPrintOnlyEspressoDescAndCost() {
        Beverage beverage = new Espresso();
        assertThat(beverage.cost(), is(1.99));
        System.out.println(beverage.getDescription() + " - $" + beverage.cost());
    }

    @Test
    public void whenOrderADarkRoastWithDoubleMochaAndWhipThenHasToPrintItAll() {
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        assertThat(beverage2.cost(), is(1.64));
        System.out.println(beverage2.getDescription() + " - $" + beverage2.cost());
    }

    @Test
    public void whenOrderAHouseBlendWithSoyAndMochaAndWhipThenHasToPrintItAll() {
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        assertThat(beverage3.cost(), is(1.49));
        System.out.println(beverage3.getDescription() + " - $" + beverage3.cost());
    }

}