package inno.factorymethod;

public class TeacherWorkFactory implements IWorkFactory{
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}
