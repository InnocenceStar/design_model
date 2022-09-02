package inno.observer;

public class ChangJiangPoliceman implements Policeman{
    @Override
    public void action(Citizen ci) {
        String help = ci.getHelp();
        if("normal".equals(help)){
            System.out.println("一切正常，不用出动");
        }
        if("unnormal".equals(help)){
            System.out.println("有违法行为，长江警察执行任务");
        }
    }
}
