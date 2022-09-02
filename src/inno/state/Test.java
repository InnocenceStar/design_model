package inno.state;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setWeather(new Sunshine());
        System.out.println(context.weatherMessage());

        System.out.println("======");

        Context context1 = new Context();
        context1.setWeather(new Rain());
        System.out.println(context1.weatherMessage());
    }
}
