package observer.javaembeded;

import java.util.Observable;

/**
 * Class WeatherData.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    /**
     * Method measurementsChanged - calls setChanged() and notifyObservers() methods.
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    /**
     * Method setMeasurements - measurements setter.
     *
     * @param temperature - temperature.
     * @param humidity    - humidity.
     * @param pressure    - pressure.
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
