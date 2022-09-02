package inno.facade;

public class Test {
    public static void main(String[] args) {
        ServiceAImpl serviceA = new ServiceAImpl();
        ServiceBImpl serviceB = new ServiceBImpl();
        serviceA.methodA();
        serviceB.methodB();
        System.out.println("=====");
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();

    }
}
