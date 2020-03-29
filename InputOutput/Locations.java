import java.util.HashMap;
import java.util.Map;

/**
 * Created by kritisharma on 3/22/20.
 */
public class Locations
{
    private final int LocationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Locations(int locationID, String description, Map<String, Integer> exits)
    {
        LocationID = locationID;
        this.description = description;
        if(exits != null)
        {
            this.exits = new HashMap<String, Integer>(exits);
        }
        else
        {
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location)
//    {
//        exits.put(direction, location);   //map: key, value
//    }

    public int getLocationID()
    {
        return LocationID;
    }

    public String getDescription()
    {
        return description;
    }

    public Map<String, Integer> getExits()
    {
        return new HashMap<String, Integer>(exits);  //instead of returning the exits, we can create a new map and pass the exits
    }                                                //just a copy so that it cannot be changed at all


}
