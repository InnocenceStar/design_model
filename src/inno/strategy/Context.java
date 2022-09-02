package inno.strategy;

public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doMethod(){
        strategy.method();
    }
}
