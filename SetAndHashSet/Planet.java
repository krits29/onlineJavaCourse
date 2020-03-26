/**
 * Created by kritisharma on 3/26/20.
 */
public class Planet extends HeavenlyBody
{
    public Planet(String name, double orbitalPeriod)
    {
        super(name, orbitalPeriod, 'p');
    }

    @Override
    public boolean addMoon(HeavenlyBody moon)
    {
        if(moon.getBodyType() == 'm')
        {
            return super.addMoon(moon);
        }
        else
        {
            return false;
        }
    }
}
