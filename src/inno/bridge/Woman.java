package inno.bridge;

public class Woman extends Person{
    public Woman() {
        setType("女人");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
