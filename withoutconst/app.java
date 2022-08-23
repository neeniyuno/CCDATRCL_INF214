public class App {
    public static void main(String[] args) throws Exception {
        
        Character tank = new Character();

        tank.strength = 10;
        tank.agility = 5;
        tank.intelligence = 2;
        tank.name = "Garen";
        tank.sayMyName();
        tank.sayMyStrengthAndAgility();
        tank.sayMyIntelligence();
        System.out.print("\n");

        Character healer = new Character();
        healer.strength = 5;
        healer.agility = 5;
        healer.intelligence = 10;
        healer.name = "Soraka";
        healer.sayMyName();
        healer.sayMyStrengthAndAgility();
        healer.sayMyIntelligence();
        System.out.print("\n");

        Character jungler = new Character();

        jungler.strength = 8;
        jungler.agility = 10;
        jungler.intelligence = 8;
        jungler.name = "Evelyn";
        jungler.sayMyName();
        jungler.sayMyStrengthAndAgility();
        jungler.sayMyIntelligence();
        System.out.print("\n");

    }
}
