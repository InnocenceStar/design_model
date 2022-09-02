package inno.observer;

public class Test {
    public static void main(String[] args) {
        Policeman huangPuPoliceman = new HuangPuPoliceman();
        Policeman changJiangPoliceman = new ChangJiangPoliceman();

        Citizen huangPuCitizen = new HuangPuCitizen(huangPuPoliceman);
        huangPuCitizen.sendMessage("unnormal");
        huangPuCitizen.sendMessage("normal");

        System.out.println("======");

        Citizen changJiangCitizen = new ChangJiangCitizen(changJiangPoliceman);
        changJiangCitizen.sendMessage("unnormal");
        changJiangCitizen.sendMessage("normal");


    }
}
