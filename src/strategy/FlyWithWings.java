package strategy;

/**
 * Created by Rafael on 2016-11-02.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying!!!");
    }

}
