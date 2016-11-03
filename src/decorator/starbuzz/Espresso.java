package decorator.starbuzz;

/**
 * Created by Rafael on 2016-11-02.
 */
public class Espresso extends Beverage {

    public Espresso() {
        super.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
