package iterator.menu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rafael on 2016-11-02.
 */
public class DinerMenu<T> implements Menu<T> {

    private T[] menuItems;

    @Override
    public Iterator<T> createIterator() {
        return new DinerMenuIterator<>(menuItems);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addItem(T item) {
        if (menuItems == null) {
            menuItems = (T[]) Array.newInstance(item.getClass(), 0);
        }

        List<T> menuList = new ArrayList<>();
        menuList.addAll(Arrays.asList(menuItems));
        menuList.add(item);
        menuItems = menuList.toArray(menuItems);
    }

}