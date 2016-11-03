package factory.factorymethod;

/**
 * Created by Rafael on 2016-11-03.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                throw new IllegalArgumentException("Invalid Pizza Type");
        }
    }

}
