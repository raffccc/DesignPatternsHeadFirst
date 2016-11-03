package factory.factorymethod;

/**
 * Created by Rafael on 2016-11-03.
 */
public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {
        switch (type) {
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "cheese":
                return new ChicagoStyleCheesePizza();
            default:
                throw new IllegalArgumentException("Invalid Pizza Type");
        }
    }

}
