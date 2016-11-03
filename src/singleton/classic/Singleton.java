package singleton.classic;

/**
 * Created by Rafael on 2016-11-02.
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return  uniqueInstance;
    }
}
