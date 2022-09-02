package inno.decorator;

public class Test {
    public static void main(String[] args) {
        Person person = new Man();
        //Person person = new Woman();
        ManDecoratorA manDecoratorA = new ManDecoratorA();
        ManDecoratorB manDecoratorB = new ManDecoratorB();

        manDecoratorA.setPerson(person);
        manDecoratorB.setPerson(person);
        manDecoratorA.eat();
        manDecoratorB.eat();
    }
}
