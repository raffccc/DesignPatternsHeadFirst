package factory.pizzas;

/**
 * Created by Rafael on 2016-11-03.
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        super.name = "Cheese Pizza";
        super.dough = "Regular Crust";
        super.sauce = "Marinara Pizza Sauce";
        super.toppings.add("Fresh Mozzarella");
        super.toppings.add("Parmesan");
    }
}
