public class Characters {
    //initializations
    int strength;
    int agility;
    int intelligence;
    String name;
    
    
    //methods
    public void sayMyName()
    {
        System.out.println("Hello I am " + name);
    }

    public void sayMyStrengthAndAgility()
    {
        System.out.println(name + "'s" + " strength is " + strength + " and the agility is " + agility);
    }

    public void sayMyIntelligence()
    {
        System.out.println(name + "'s" + " intelligence is " + intelligence);
    }

    //constructor
    public Characters(int str, int agi, int intel, String characName)
    {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characName;
    }
}
