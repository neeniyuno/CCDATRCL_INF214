public class App {
    public static void main(String[] args) throws Exception {
        
        //creating object
        Characters tank = new Characters(10, 5, 2, "Garen");
        //calling the methods
        tank.sayMyName();
        tank.sayMyStrengthAndAgility();
        tank.sayMyIntelligence();
        System.out.print("\n");

        //creating object
        Characters healer = new Characters(5, 5, 10, "Soraka");
        //calling the methods
        healer.sayMyName();
        healer.sayMyStrengthAndAgility();
        healer.sayMyIntelligence();
        System.out.print("\n");

        //creating object
        Characters jungler = new Characters(8, 10, 8, "Evelyn");
        //calling the methods
        jungler.sayMyName();
        jungler.sayMyStrengthAndAgility();
        jungler.sayMyIntelligence();
        System.out.print("\n");

    }
}
