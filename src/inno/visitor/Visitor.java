package inno.visitor;

import java.util.Collection;

public interface Visitor {

    public void visitString(StringElement stringElement);

    public void visitFloat(FloatElement floatElement);

    public void visitCollection(Collection collection);
}
