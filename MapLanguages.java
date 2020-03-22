import java.util.HashMap;
import java.util.Map;

/**
 * Created by kritisharma on 3/22/20.
 */
public class MapLanguages
{
    public static void main(String[] args)
    {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "current language I am coding in right now"); //for a particular key, there can only be one value
        languages.put("GoLang", "the fancy language papa codes in");
        languages.put("HTML", "the language that I want to learn with CSS to make websites");
        languages.put("C#", "used in Unity, so it would be fun to learn and create games");
        languages.put("C++", "first language I learned and used it with Arduino and got pretty good at it");

        for (String key: languages.keySet())
        {
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println("-----------------------");

        if(languages.containsKey("Java"))
        {
            System.out.println("Java is already in the map");
        }
        else
        {
            languages.put("Java", "This course is about java");
        }

        //two ways to remove/replace
        //just with key

        languages.remove("C#");
        languages.replace("GoLang", "a language by google");

        //with key and corresponding value
        if(languages.remove("C++", "Not super common though"))
        {
            System.out.println("removed");
        }
        else
        {
            System.out.println("not removed");
        }

        if(languages.replace("GoLang", "a language by google", "the fancy language papa codes in"))
        {
            System.out.println("replaced back");
        }
        else
        {
            System.out.println("not replaced");
        }

        System.out.println("----------------------");

        for (String key: languages.keySet())
        {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
