import java.util.ArrayList;

/**
 * Created by kritisharma on 3/18/20.
 */
public class Team<T extends Player> implements Comparable<Team<T>>
{
    private String name;
    int totalGames;
    int wins;
    int losses;
    int ties;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean addMembers(T player)
    {
        if(this.members.contains(player))
        {
            System.out.println(this.getName() + " already has " + player.getName() + " in the team.");
            return false;
        } else
        {
            System.out.println(this.getName() + " added " + player.getName() + " to the team.");
            return true;
        }
    }

    public void results(Team<T> opponent, int ourScore, int theirScore)
    {
        String message;
        if(ourScore > theirScore)
        {
            this.wins++;
            message = " beat ";
        }
        else if (ourScore < theirScore)
        {
            this.losses++;
            message = " lost to ";
        }
        else
        {
            this.ties++;
            message = " tied with ";
        }

        totalGames++;

        if(opponent != null)
        {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.results(null, theirScore, ourScore);
        }
    }

    public int ranking()
    {
        return (this.wins * 2) - this.losses + this.ties;
    }

    @Override
    public int compareTo(Team<T> team)
    {
        if(this.ranking() > team.ranking())
        {
            return -1;
        }
        else if(this.ranking() < team.ranking())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}
