package observer.weatherobservable;

import observer.weather.Observer;
import observer.weather.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Rafael on 2016-11-02.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;


    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

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
