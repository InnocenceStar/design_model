package inno.singleton;

/**
 * 懒汉式
 * volatile禁止指令重排序
 * 线程安全
 */
public class SingletonExample5 {
    private SingletonExample5(){}

    private volatile static SingletonExample5 singletonExample5 = null;

    public static SingletonExample5 getInstance(){
        if(singletonExample5==null){
            synchronized(SingletonExample5.class){
                if(singletonExample5==null){
                    return new SingletonExample5();
                }
            }
        }
        return singletonExample5;
    }
}
