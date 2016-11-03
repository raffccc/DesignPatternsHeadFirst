package iterator.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafael on 2016-11-02.
 */
public class PancakeHouseMenu<T> implements Menu<T> {

    private List<T> menuItens = new ArrayList<>();

    @Override
    public Iterator<T> createIterator() {
        return new PancakeHouseMenuIterator<T>(menuItens);
    }

    @Override
    public void addItem(T item) {
        menuItens.add(item);
    }
}
