package singleton.stat;

/**
 * Created by Rafael on 2016-11-02.
 */
public class Singleton {

    //Perde o LazyInstantiation
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return  uniqueInstance;
    }
}
