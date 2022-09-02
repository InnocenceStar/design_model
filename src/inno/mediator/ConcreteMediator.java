package inno.mediator;


public class ConcreteMediator extends Mediator {

    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public ConcreteMediator() {
        colleagueA = new ColleagueA();
        colleagueB = new ColleagueB();
    }

    @Override
    public void notice(String content) {
        if ("boss".equals(content)){
            colleagueA.action();
        }
        if("client".equals(content)){
            colleagueB.action();
        }
    }
}
