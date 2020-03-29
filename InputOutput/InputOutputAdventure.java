import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by kritisharma on 3/22/20.
 */
public class InputOutputAdventure
{
    private static Scenes locations = new Scenes();

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

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


