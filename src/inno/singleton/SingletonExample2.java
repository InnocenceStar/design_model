package inno.singleton;

/**
 * 饿汉模式
 * 线程安全
 */
public class SingletonExample2 {
    private SingletonExample2(){}

    private static SingletonExample2 singletonExample2 = new SingletonExample2();

    public static SingletonExample2 getInstance(){
        return singletonExample2;
    }
}
