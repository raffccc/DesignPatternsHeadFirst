package state;

/**
 * Created by Rafael on 2016-11-02.
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

}
