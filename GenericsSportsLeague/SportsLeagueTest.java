/**
 * Created by kritisharma on 3/18/20.
 */
public class SportsLeagueTest
{
    public static void main(String[] args)
    {
        SportsLeague<Team<FootballPlayer>> footballLeague = new SportsLeague<>("My League");
        Team<FootballPlayer> cougars = new Team<>("Cougars");
        Team<FootballPlayer> huskies = new Team<>("Huskies");
        Team<FootballPlayer> seahawks = new Team<>("Seahawks");
        Team<FootballPlayer> cardinals = new Team<>("Cardinals");
        Team<TennisPlayer> usta = new Team<>("USTA");

        footballLeague.addTeam(cougars);
        footballLeague.addTeam(huskies);
        footballLeague.addTeam(seahawks);
        footballLeague.addTeam(cardinals);

        //footballLeague.addTeam(usta);
        //...see this wont work because the types won't match

        //but what you can do is this:

        SportsLeague<Team<TennisPlayer>> tennisLeague = new SportsLeague<>("Roland Garros");
        tennisLeague.addTeam(usta);

        cougars.results(huskies, 3, 4);
        //seahawks.results(usta, 4, 6);
        //...again this wont work becuase the type in the parameter wont work

        seahawks.results(cardinals, 5, 1);

        footballLeague.showLeague();
    }
}
