package factory.factorymethod;

/**
 * Created by Rafael on 2016-11-03.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            default:
                throw new IllegalArgumentException("Invalid Pizza Type");
        }
    }

}
