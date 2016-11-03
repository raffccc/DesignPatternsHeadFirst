package decorator.starbuzz;

/**
 * Created by Rafael on 2016-11-02.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
