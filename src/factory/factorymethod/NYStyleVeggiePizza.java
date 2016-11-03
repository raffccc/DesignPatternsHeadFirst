package factory.factorymethod;

/**
 * Created by Rafael on 2016-11-03.
 */
public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        super.name = "NY Veggie Pizza";
        super.dough = "Crust";
        super.sauce = "Marinara Sauce";
        super.toppings.add("Shredded Mozzarella");
        super.toppings.add("Grated Parmesan");
        super.toppings.add("Diced Onion");
        super.toppings.add("Sliced mushrooms");
        super.toppings.add("Sliced red pepper");
        super.toppings.add("Sliced black olives");
    }

}
