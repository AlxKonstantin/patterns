package observer;

import observer.selfrealisation.CurrentConditionsDisplay;
import observer.selfrealisation.WeatherData;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void whenPassWetherDataThenHasToShowIt() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        /*StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);*/
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
