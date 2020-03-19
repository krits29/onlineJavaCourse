import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by kritisharma on 3/18/20.
 */
public class SportsLeague<T extends Team>  //this is the generics part
{
    public String name;
    public ArrayList<T> league = new ArrayList<>();

    public SportsLeague(String name)
    {
        this.name = name;
    }

    public boolean addTeam(T team)
    {
        if(league.contains(team))
        {
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeague()
    {
        Collections.sort(league);
        for(T t : league)
        {
            System.out.println(t.getName() + " : " + t.ranking());
        }
    }
}
