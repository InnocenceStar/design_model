package inno.memento;

public class Test {
    public static void main(String[] args) {
        Originator org = new Originator();
        org.setState("开会中");
        org.showState();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(org.createMemento());

        org.setState("睡觉中");

        org.showState();

        org.setMemento(caretaker.getMemento());
        org.showState();

    }
}
