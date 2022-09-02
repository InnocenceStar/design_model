package inno.factorymethod;

public class StudentWorkFactory implements IWorkFactory{
    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
