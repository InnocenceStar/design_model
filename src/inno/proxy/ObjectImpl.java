package inno.proxy;

public class ObjectImpl implements Object{
    @Override
    public void action() {
        System.out.println("这是被代理的类");
    }
}
