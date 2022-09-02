package inno.bridge;

public class Trouser extends Clothing{
    @Override
    public void personDressCloth(Person person) {
        System.out.println(person.getType()+"穿裤子");
    }
}
