package inno.singleton;

/**
 * 懒汉模式
 * 线程不安全
 */
public class SingletonExample1 {
    private SingletonExample1(){}
    private static SingletonExample1 singletonExample1 = null;

    public static SingletonExample1 getInstance(){
        if(singletonExample1==null){
            return new SingletonExample1();
        }
        return singletonExample1;
    }
}
