package inno.command;

public class Test{
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        CommandImpl command = new CommandImpl(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.execute();
    }
}
