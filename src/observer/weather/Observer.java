package observer.weather;

/**
 * Created by Rafael on 2016-11-02.
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);

}