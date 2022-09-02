package inno.observer;

public class ChangJiangCitizen extends Citizen{
    public ChangJiangCitizen(Policeman pol) {
        setPolicemen();
        register(pol);
    }

    @Override
    void sendMessage(String help) {
        setHelp(help);
        for (int i = 0; i < pols.size(); i++) {
            Policeman policeman = pols.get(i);
            policeman.action(this);

        }
    }
}
