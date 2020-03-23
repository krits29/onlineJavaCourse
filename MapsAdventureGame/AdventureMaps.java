import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by kritisharma on 3/22/20.
 */
public class AdventureMaps
{
    private static Map<Integer, Locations> locations = new HashMap<Integer, Locations>();

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        locations.put(0, new Locations(0, "You are sitting in the front of a computer learning java"));
        locations.put(1, new Locations(1, "You are inside your bathroom taking a long shower"));
        locations.put(2, new Locations(2, "You are playing tennis in your regular Sunday tennis class"));
        locations.put(3, new Locations(3, "You are taking a test in your AP Chemistry class"));
        locations.put(4, new Locations(4, "You are in the movie theater with your best friends"));
        locations.put(5, new Locations(5, "You are locked in the garage for your bad behavior"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
        locations.get(5).addExit("Q", 0);


        int loc = 1;
        while(true)
        {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0)
            {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();   //indicating directions now
            System.out.print("Avaiable exits are ");
            for(String exit: exits.keySet())
            {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String directions = scan.nextLine().toUpperCase();

            if(exits.containsKey(directions))
            {
                loc = exits.get(directions);
            }
            else
            {
                System.out.println("You cant go in the direction");
            }

        }

    }
}


