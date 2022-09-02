package inno.strategy;

public class Test {
    public static void main(String[] args) {

        Context context = new Context(new StrategyImplA());
        context.doMethod();

        context = new Context(new StrategyImplB());
        context.doMethod();

        context = new Context(new StrategyImplC());
        context.doMethod();

    }
}
