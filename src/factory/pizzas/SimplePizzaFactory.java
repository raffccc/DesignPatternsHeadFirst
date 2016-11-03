package factory.pizzas;

/**
 * Created by Rafael on 2016-11-03.
 */
public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {
        switch (type) {
            case "veggie":
                return new VeggiePizza();
            case "cheese":
                return new CheesePizza();
            default:
                throw new IllegalArgumentException("Invalid Pizza Type");
        }
    }

}
