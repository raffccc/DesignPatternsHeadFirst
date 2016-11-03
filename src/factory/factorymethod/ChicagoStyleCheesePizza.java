package factory.factorymethod;

/**
 * Created by Rafael on 2016-11-03.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        super.name = "Chicago Style Deep Dish Cheese Pizza";
        super.dough = "Extra Thick Crust Dough";
        super.sauce = "Plum Tomato Sauce";
        super.toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
