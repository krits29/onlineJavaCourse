package academy.learnprogramming;

public class MethodOverloading
{
    public static void main(String[] args)
    {
        int newScore = CalculateScore("Me", 500);
        System.out.println("New score is " + newScore);
        CalculateScore(500); //when we type in CalculateScore, there will be two options and we can choose the one we want
                            // this is called an overloaded method
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(72);

        getDurationString(5, 30);
        getDurationString(350);
    }

    public static int CalculateScore ( String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int CalculateScore (int score)
    {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    /////---challenge---/////

    public static double calcFeetAndInchesToCentimeters(int feet, int inches)
    {
        if (feet >= 0 && inches >= 0 && inches <= 12)
        {
            double centimeters = (((feet * 12) + inches) * 2.54) ;
            System.out.println(centimeters);
            return centimeters;
        }
        else
        {
            System.out.println("These are not valid numbers");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters( int inches )
    {
        if (inches >= 0)
        {
            int feet = inches / 12 ;
            int remainingInches = inches % 12;

            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        else
        {
            return -1;
        }
    }

    //---another challenge---//

    public static void getDurationString(int minutes, int seconds)
    {
        if (minutes<0 || seconds > 59 || seconds < 0)
        {
            System.out.println("invalid value");
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(hours + " hrs " + minutes + " mins " + seconds + " secs" );
    }

    public static void getDurationString(int seconds)
    {
        if (seconds < 0)
        {
            System.out.println("invalid value");
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        getDurationString(minutes, remainingSeconds);
    }

}
