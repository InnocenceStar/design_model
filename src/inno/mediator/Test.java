package inno.mediator;

public class Test {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        mediator.notice("boss");

        mediator.notice("client");
    }
}
