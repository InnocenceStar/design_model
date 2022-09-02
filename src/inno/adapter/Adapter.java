package inno.adapter;

public class Adapter implements Target{

    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMethod() {
        adaptee.apapteeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("adapter method");
    }
}
