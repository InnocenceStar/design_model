package inno.visitor;

import java.util.Collection;
import java.util.Iterator;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visitString(StringElement stringElement) {
        System.out.println(stringElement.getSe());
    }

    @Override
    public void visitFloat(FloatElement floatElement) {
        System.out.println(floatElement.getFe());
    }

    @Override
    public void visitCollection(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if(o instanceof Visitable){
                ((Visitable)o).accept(this);
            }
        }
    }
}
