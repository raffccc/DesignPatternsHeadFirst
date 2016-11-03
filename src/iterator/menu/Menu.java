package iterator.menu;

/**
 * Created by Rafael on 2016-11-02.
 */
public interface Menu<T> {

    Iterator<T> createIterator();

    void addItem(T item);

}
