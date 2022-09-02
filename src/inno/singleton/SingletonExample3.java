package inno.singleton;

/**
 * 懒汉式
 * 线程安全
 * 不推荐
 */
public class SingletonExample3 {
    private SingletonExample3(){}

    private static SingletonExample3 singletonExample3 = null;

    public static synchronized SingletonExample3 getInstance(){
        if(singletonExample3==null){
            return new SingletonExample3();
        }
        return singletonExample3;
    }
}
