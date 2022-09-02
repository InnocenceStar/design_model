package inno.factorymethod;

public class TeacherWork implements Work{
    @Override
    public void work() {
        System.out.println("老师审批作业");
    }
}
