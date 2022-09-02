package inno.observer;

public class HuangPuPoliceman implements Policeman{
    @Override
    public void action(Citizen ci) {
        String help = ci.getHelp();
        if("normal".equals(help)){
            System.out.println("一切正常，不用出动");
        }
        if("unnormal".equals(help)){
            System.out.println("有违法行为，黄浦警察执行任务");
        }
    }
}
