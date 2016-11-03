package iterator.menu;

/**
 * Created by Rafael on 2016-11-02.
 */
public class DinerMenuIterator<T> implements Iterator<T> {

    private T[] items;
    private int index = 0;

    public DinerMenuIterator(T[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items != null && index < items.length;
    }

    @Override
    public T next() {
        return items[index++];
    }

}
