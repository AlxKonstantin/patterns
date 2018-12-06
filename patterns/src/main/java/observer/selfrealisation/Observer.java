package observer.selfrealisation;

/**
 * Interface Observer.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public interface Observer {

    /**
     * Method update - updates data.
     *
     * @param temp - temperature.
     * @param humidity - humidity.
     * @param pressure - pressure.
     */
    void update(float temp, float humidity, float pressure);
}
