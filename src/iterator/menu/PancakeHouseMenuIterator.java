package iterator.menu;

import java.util.List;

/**
 * Created by Rafael on 2016-11-02.
 */
public class PancakeHouseMenuIterator<T> implements Iterator<T> {

    private List<T> items;
    private int index = 0;

    public PancakeHouseMenuIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items != null && index < items.size();
    }

    @Override
    public T next() {
        return items.get(index++);
    }
}
