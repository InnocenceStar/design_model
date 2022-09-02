package inno.observer;


import java.util.ArrayList;
import java.util.List;

public abstract class Citizen {
    List<Policeman> pols;
    String help = "normal";

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    abstract void sendMessage(String help);

    public void setPolicemen(){
        this.pols = new ArrayList();
    }

    public void register(Policeman pol){
        this.pols.add(pol);
    }

    public void unRegister(){
        this.pols.remove(pols);

    }}
