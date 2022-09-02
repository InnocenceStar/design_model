package inno.visitor;

public class StringElement implements Visitable{
    private String se;

    public StringElement(String se) {
        this.se = se;
    }

    public String getSe() {
        return se;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}
