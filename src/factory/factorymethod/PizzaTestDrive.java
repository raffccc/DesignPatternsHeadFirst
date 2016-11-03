package factory.factorymethod;

/**
 * Created by Rafael on 2016-11-03.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        //Pizza Store
        PizzaStore store = new NYPizzaStore();

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);

        //Chicago Store
        store = new ChicagoPizzaStore();

        pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);
    }

}
