package inno.bridge;

public class Test {
    public static void main(String[] args) {
        Person man = new Man();
        Person woman = new Woman();
        Clothing jacket = new Jacket();
        Clothing trouser = new Trouser();

        jacket.personDressCloth(man);
        trouser.personDressCloth(man);

        jacket.personDressCloth(woman);
        trouser.personDressCloth(woman);
    }
}
