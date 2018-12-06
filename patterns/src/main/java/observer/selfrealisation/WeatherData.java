package observer.selfrealisation;

import java.util.ArrayList;

/**
 * Class WeatherData.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class WeatherData implements Subject {

    /**
     * observers - observers storage.
     */
    private ArrayList observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Method measurementsChanged - calls notifyObservers() method.
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * Method setMeasurements - measurements setter.
     *
     * @param temperature - temperature.
     * @param humidity - humidity.
     * @param pressure - pressure.
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
