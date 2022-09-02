package inno.singleton;

/**
 * m枚举方式实例化
 * 线程最安全
 */
public class SingletonExample7 {
    private SingletonExample7(){}

    public static SingletonExample7 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }
    private enum Singleton{
        INSTANCE;
        private SingletonExample7 singleton;

        Singleton(){
            singleton = new SingletonExample7();
        }
        public SingletonExample7 getInstance(){
            return singleton;
        }
    }

}
