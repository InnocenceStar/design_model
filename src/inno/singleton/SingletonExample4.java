package inno.singleton;

/**
 * 懒汉式
 * 双重锁同步锁
 * 线程不安全；涉及到CPU指令重排序
 */
public class SingletonExample4 {
    private SingletonExample4(){}
    private static SingletonExample4 singletonExample4 = null;

    public static SingletonExample4 getInstance(){
        if(singletonExample4==null){
            synchronized (SingletonExample4.class){
                if(singletonExample4==null){
                    return new SingletonExample4();
                }
            }
        }
        return singletonExample4;
    }
}
