import java.util.HashSet;
import java.util.Set;

/**
 * Created by kritisharma on 3/23/20.
 */
public class HeavenlyBody
{
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    protected final char bodyType;

    public static final char PLANET = 'p';
    public static final char MOON = 'm';

    public HeavenlyBody(String name, double orbitalPeriod, char bodyType)
    {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName()
    {
        return name;
    }

    public double getOrbitalPeriod()
    {
        return orbitalPeriod;
    }

    public char getBodyType()
    {
        return bodyType;
    }

    public boolean addMoon(HeavenlyBody moon)
    {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites()
    {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }

        if(obj instanceof HeavenlyBody)
        {
            HeavenlyBody bodyObject = (HeavenlyBody) obj;
            /*if(this.name.equals(bodyObject.getName()))
            {
                return this.bodyType == bodyObject.getBodyType();
            }*/

            return (this.name.equals(bodyObject.getName()) && this.bodyType == bodyObject.getBodyType());

        }
        return false;
//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
//
//        if((obj == null) || (obj.getClass() != this.getClass()))
//        {
//            return false;
//        }
        //String objName = ((HeavenlyBody) obj).getName();
        //return this.name.equals(objName);
    }

    @Override
    public final int hashCode()
    {
//        System.out.println("Hashcode called");
          return this.name.hashCode() + 70;
    }
}
