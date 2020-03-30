import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by kritisharma on 3/29/20.
 */
public class Scenes implements Map<Integer, Locations>
{
    private static Map<Integer, Locations> locations = new HashMap<Integer, Locations>();

    // creating a FileWriter object
    // passes the file name as a parameter to the constructor
    // then uses the write method to write data to the file

    public static void main(String[] args)
    throws IOException
    {
        try(FileWriter localFile = new FileWriter("locations.txt");  //ensures that the first error is the one thrown back instead of hiding it
            FileWriter dirFile = new FileWriter("directions.txt"))
        {
            for(Locations loc : locations.values())
            {
                localFile.write(loc.getLocationID() + ": " + loc.getDescription() + "\n");
                for(String dir: loc.getExits().keySet())
                {
                    dirFile.write(loc.getLocationID() + ": " + dir + loc.getExits().get(dir) + "\n");
                }
            }
        }
//        FileWriter localFile = null;
//        //without try/catch, we'll have an error
//        try
//        {
//            localFile = new FileWriter("locations.txt");
//            for(Locations i : locations.values())
//            {
//                localFile.write(i.getLocationID() + ": " + i.getDescription() + "\n");
//                //throw new IOException("test exception thrown while writing");
//                //can be helpful for testing, but make sure to delete it
//            }
//        }
//        finally   //when something possible could go wrong, it is guaranteed to go into this finally block
//        {
//            System.out.println("finally block");
//            if(localFile != null)
//            {
//                System.out.println("closing");
//                localFile.close();
//            }
//            localFile.close();    //what? 8.45
//        }

    }

    static //copy of static data to keep all data consistent
    {
        //only executed once
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

    }

    //command n
    //implement methods from the interface Map

    @Override
    public int size()
    {
        return locations.size();
    }

    @Override
    public boolean isEmpty()
    {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key)
    {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value)
    {
        return locations.containsValue(value);
    }

    @Override
    public Locations get(Object key)
    {
        return locations.get(key);
    }

    @Override
    public Locations put(Integer key, Locations value)
    {
        return locations.put(key, value);
    }

    @Override
    public Locations remove(Object key)
    {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Locations> m)
    {

    }

    @Override
    public void clear()
    {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet()
    {
        return locations.keySet();
    }

    @Override
    public Collection<Locations> values()
    {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Locations>> entrySet()
    {
        return locations.entrySet();
    }
}
