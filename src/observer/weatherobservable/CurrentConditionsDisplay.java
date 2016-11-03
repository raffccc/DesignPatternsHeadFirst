package observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Rafael on 2016-11-02.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %.2fF degrees and %.2f%% humidity", this.temperature, this.humidity);
    }

    /*
        Essa é a abordagem do pull, quando os observers requisita os dados do observable.
        Caso a abordagem fosse push, ou seja, o observable empurrando o dado para os observers, os valores estariam no arg
     */
    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
        }

        display();
    }
}
