package inno.interpreter;

public class AdvanceExpression extends Expression{
    @Override
    void interpret(Context ctx) {
        System.out.println("这是高级解析器");
    }
}
