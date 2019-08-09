/**
 * Created by kritisharma on 8/9/19.
 */
public class PlayingCat
{
    public static boolean isCatPlaying (boolean summer, int temperature)
    {
        if (temperature < 25)
        {
            System.out.println("not playing");
            return false;
        }
        else if (summer == true && temperature > 45)
        {
            System.out.println("not playing");
            return false;
        }
        else if (summer == false && temperature > 35)
        {
            System.out.println("not playing");
            return false;
        }
        else
        {
            System.out.println("playing");
            return true;
        }
    }
}
