
import java.util.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        /*String[] mytopgames = {"Valorant", "League of Legends", "Counter Strike GO"};

        //most favorite
        //System.out.println(mytopgames[0]);

        //least favorite
        //System.out.println(mytopgames[2]);

        for (int i = 0; i < 3; i++)
        {
            System.out.println(mytopgames[i]);
        }

        String[] topplaces = {"baguio", "palawan", "iloilo"};

        for (int i = 0; i < 3; i++)
        {
            System.out.println(topplaces[i]);
        }

        Stack <String> stk = new Stack<>();

        stk.push("red shirt");
        stk.push("blue shirt");
        stk.push("yellow shirt");

        stk.pop();
        System.out.println(stk);*/

        Queue<String> restaurantkineme = new LinkedList<>();
        restaurantkineme.add("Lala");
        restaurantkineme.add("Lili");
        restaurantkineme.add("Lulu");
        restaurantkineme.add("Lolo");

        System.out.println("The queue is: " + restaurantkineme);
        restaurantkineme.remove();

        System.out.println("The queue is: " + restaurantkineme);

    }
}
