package observer.weather;

/**
 * Created by Rafael on 2016-11-02.
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
