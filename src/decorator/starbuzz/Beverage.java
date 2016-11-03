package decorator.starbuzz;

/**
 * Created by Rafael on 2016-11-02.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
