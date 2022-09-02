package inno.interpreter;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.add(new SimpleExpression());
        context.add(new AdvanceExpression());
        context.add(new SimpleExpression());
        for (Expression expression : context.getList()) {
            expression.interpret(context);
        }
    }
}
