package inno.prototype;

public class Prototype implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone(){
        try{
            return super.clone();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
