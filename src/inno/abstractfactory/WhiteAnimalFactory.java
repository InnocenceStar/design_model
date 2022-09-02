package inno.abstractfactory;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class WhiteAnimalFactory implements IAnimalFactory{
    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
}
