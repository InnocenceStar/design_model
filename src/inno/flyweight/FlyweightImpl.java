package inno.flyweight;

public class FlyweightImpl implements Flyweight{
    @Override
    public void action(int arg) {
        System.out.println("参数值："+arg);
    }
}
