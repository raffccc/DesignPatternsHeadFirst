package iterator.menu;

/**
 * Created by Rafael on 2016-11-02.
 */
public class Cafe {

    public static void main(String[] args) {
        PancakeHouseMenu<String> pancakeHouseMenu = new PancakeHouseMenu<>();
        pancakeHouseMenu.addItem("Blueberry Pancakes");
        pancakeHouseMenu.addItem("Waffles");
        pancakeHouseMenu.addItem("Regular Pancake");

        DinerMenu<String> dinerMenu = new DinerMenu<>();
        dinerMenu.addItem("Vegetarian BLT");
        dinerMenu.addItem("Soup of the Day");
        dinerMenu.addItem("Pasta");

        Iterator<String> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<String> dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU (with iterators)");
        System.out.println("BREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private static void printMenu(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
