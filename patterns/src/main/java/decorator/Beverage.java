package decorator;

/**
 * Abstract class Beverage.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * Method cost - cost of every drink or addition getter.
     *
     * @return cost of item.
     */
    public abstract double cost();

}
