import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kritisharma on 3/25/20.
 */
public class Sets
{
    public static void main(String[] args)
    {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i <= 100; i++)
        {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares); //adding the squares in the set
        union.addAll(cubes);  //adding the cubes as well
        System.out.println("Union contains " + union.size() + " elements");
        //Output: Union contains 196 elements //because a set doesnt containn repeated inout

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("intersection contains " + intersection.size() + " elements");
        for(int i : intersection)
        {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "My name is Anthony Ganzalez";
        String[] arrayOfWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayOfWords));
        for(String s : words)
        {
            System.out.println(s);
        }

        Set<String> night = new HashSet<>();
        Set<String> day = new HashSet<>();

        String[] nightWords = {"moon", "silent", "black", "dark", "stars", "midnight", "sunset", "dusk", "sky", "clouds"};
        night.addAll(Arrays.asList(nightWords)); //adding an array into a set
        String[] dayWords = {"sun", "alive", "blue", "bright", "sky", "midday", "sunrise", "dawn", "clouds"};
        day.addAll(Arrays.asList(dayWords));

        System.out.println("night - day");
        Set<String> nightDay = new HashSet<>(night);
        nightDay.removeAll(day);
        printSet(nightDay);

        System.out.println("day - night");
        Set<String> dayNight = new HashSet<>(day);
        dayNight.removeAll(night);
        printSet(dayNight);

        Set<String> unionDayNight = new HashSet<>(night);
        unionDayNight.addAll(day);
        Set<String> intersectionDayNight = new HashSet<>(night);
        intersectionDayNight.retainAll(day);
        System.out.println("Symmetric difference ");
        unionDayNight.retainAll(intersectionDayNight);
        printSet(unionDayNight);

        if(night.containsAll(day))
        {
            System.out.println("Day is a subset of night");
        }
        else
        {
            System.out.println("Day is not a subset of night");
        }

        if(night.containsAll(intersectionDayNight))
        {
            System.out.println("Intersection is a subset of night");
        }
        else
        {
            System.out.println("Intersection is not a subset of night");
        }

        if(day.containsAll(intersectionDayNight))
        {
            System.out.println("Intersection is a subset of day");
        }
        else
        {
            System.out.println("Intersection is not a subset of day");
        }

    }

    private static void printSet(Set<String> obj)
    {
        for(String s : obj)
        {
            System.out.print(s + " ");
        }
        System.out.println("\n");
    }
}
