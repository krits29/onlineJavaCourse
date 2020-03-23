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

        Map<String, Integer> temporaryExit = new HashMap<String, Integer>();
        locations.put(0, new Locations(0, "You are sitting in the front of a computer learning java", temporaryExit));

        temporaryExit = new HashMap<String, Integer>();
        temporaryExit.put("W", 2);
        temporaryExit.put("E", 3);
        temporaryExit.put("S", 4);
        temporaryExit.put("N", 5);
        locations.put(1, new Locations(1, "You are inside your bathroom taking a long shower", temporaryExit));

        temporaryExit = new HashMap<String, Integer>();
        temporaryExit.put("N", 5);
        locations.put(2, new Locations(2, "You are playing tennis in your regular Sunday tennis class", temporaryExit));

        temporaryExit = new HashMap<String, Integer>();
        temporaryExit.put("W", 1);
        locations.put(3, new Locations(3, "You are taking a test in your AP Chemistry class", temporaryExit));

        temporaryExit = new HashMap<String, Integer>();
        temporaryExit.put("N", 1);
        temporaryExit.put("W", 2);
        locations.put(4, new Locations(4, "You are in the movie theater with your best friends", temporaryExit));

        temporaryExit = new HashMap<String, Integer>();
        temporaryExit.put("S", 1);
        temporaryExit.put("W", 2);  //locations.get(5).addExit("W", 2);
        locations.put(5, new Locations(5, "You are locked in the garage for your bad behavior", temporaryExit));

        Map<String, String> vocab = new HashMap<String, String>();
        vocab.put("QUIT", "Q");
        vocab.put("NORTH", "N");
        vocab.put("SOUTH", "S");
        vocab.put("EAST", "E");
        vocab.put("WEST", "W");

        int loc = 1;
        while(true)
        {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0)
            {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();   //indicating directions now
            System.out.print("Available exits are ");
            for(String exit: exits.keySet())
            {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String directions = scan.nextLine().toUpperCase();
            if(directions.length() > 1)
            {
                String[] words = directions.split(" ");
                for(String word : words)
                {
                    if(vocab.containsKey(word))
                    {
                        directions = vocab.get(word);
                        break;
                    }
                }
            }

            if(exits.containsKey(directions))
            {
                loc = exits.get(directions);
            }
            else
            {
                System.out.println("You cant go in the direction");
            }

        }

//        String[] road = "You are standing at the end of a road".split(" ");   //split up by delimeter which is the space in this case
//        for(String i : road)
//        {
//            System.out.println(i);
//        }
//
//        System.out.println("- - - - - - - - - - -");
//
//        String[] building = "You are inside a building, wow thats cool".split(", ");
//        for(String i : building)
//        {
//            System.out.println(i);
//        }

    }
}


