package inno.singleton;

/**
 * 饿汉式
 * 线程安全
 */
public class SingletonExample6 {
    private SingletonExample6(){}

    private static SingletonExample6 singletonExample6 = null;

    static {
        singletonExample6 = new SingletonExample6();
    }

    public static SingletonExample6 getInstance(){
        return singletonExample6;
    }

}
