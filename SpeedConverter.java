// udemy coding exercise

public class SpeedConverter
{
    public static long toMilesPerHour(double kilometersPerHour)
    {
        if (kilometersPerHour < 0)
        {
            return -1;
        }

        long milesPerHour = Math.round( kilometersPerHour / 1.609 ); // or you can just do return Math.round
        return milesPerHour;                                        // ( kilometersPerHour / 1.609 )
    }

    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
        {
            System.out.println("invalid value");
        }
        else
        {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mph");
        }
    }
}
