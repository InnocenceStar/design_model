package inno.prototype;

public class Test {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("prototype");
        Prototype clone = (Prototype) prototype.clone();
        System.out.println(prototype.getName());
        System.out.println(clone.getName());
    }
}
