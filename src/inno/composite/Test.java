package inno.composite;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employer pm = new ProjectManager("项目经理");
        Employer pa = new ProjectAssistant("项目助理");
        Employer programmer1 = new Programmer("程序员1");
        Employer programmer2 = new Programmer("程序员2");

        pm.add(pa);
        pm.add(programmer2);

        List<Employer> employers = pm.getEmployers();
        for (Employer employer : employers) {
            System.out.println(employer.getName());
        }
    }
}
