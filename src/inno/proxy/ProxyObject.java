package inno.proxy;

public class ProxyObject implements Object {

    Object obj;

    public ProxyObject(){
        System.out.println("proxy");
        obj = new ObjectImpl();
    }

    @Override
    public void action() {
        System.out.println("proxy start");
        obj.action();
        System.out.println("proxy end");
    }
}
