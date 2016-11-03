package strategy;

/**
 * Created by Rafael on 2016-11-02.
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeeeq!");
    }
}
