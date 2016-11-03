package strategy;

/**
 * Created by Rafael on 2016-11-02.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();

        mallard.performQuack();
        rubberDuck.performQuack();

        mallard.performFly();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }

}
