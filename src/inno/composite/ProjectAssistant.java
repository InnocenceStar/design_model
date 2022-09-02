package inno.composite;

public class ProjectAssistant extends Employer{

    public ProjectAssistant(String name) {
        setName(name);
        employers = null;   //没有下属 为叶子结点
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
