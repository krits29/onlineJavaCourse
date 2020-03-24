import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by kritisharma on 3/23/20.
 */
public class SetAndHashSet
{
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args)
    {
        // useful because they are fast
        // add, remove, contains, isEmpty methods available
        // cannot retrieve a specific value
        // all unique values


        HeavenlyBody temp = new HeavenlyBody("Mercury", 188);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(tempMoon);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 249);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets)
        {
            System.out.println("- " + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("\nMoons of " + body.getName() + ": ");
        for(HeavenlyBody jupiterMoon : body.getSatellites())
        {
            System.out.println("- " + jupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets)
        {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("\nAll moons");
        for (HeavenlyBody moon : moons)
        {
            System.out.println("- " + moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);

        for(HeavenlyBody i : planets)
        {
            System.out.println(i.getName() + ": " + i.getOrbitalPeriod());
        }

        // the print out statement:
//        Pluto: 248.0 -
//        Mars: 687.0
//        Pluto: 842.0 -
//        Venus: 225.0
//        Neptune: 165.0
//        Jupiter: 4332.0
//        Ganymede: 7.1
//        Earth: 365.0
//        Uranus: 30660.0
//        Mercury: 188.0
        // even though its a set, Pluto appears twice
        // that because there are two different java objects that do not compare equal
        // so the set is happy to accept it

        // equals method needs to be overridden
        // since the base object class from which all other classes are derived just defines a simple eqauls method
        // which is called referential equality and if both references point to the same object then theyre equal, otherwise not

        Object o = new Object(); //this is the base object that all other objects inherit from
        o.equals(o);
        "pluto".equals("");

    }
}
