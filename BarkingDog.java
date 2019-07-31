//Udemy practice coding exercises

public class BarkingDog
{
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if (barking == true)
        {
            if (hourOfDay < 8 && hourOfDay > -1)
            {
                System.out.println("Wake Up!!! Your dog is barking!");
                return true;
            }
            else if (hourOfDay > 22 && hourOfDay < 24)
            {
                return true;
                //System.out.println("Wake up!! Your dog is barking.");
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
            //System.out.println("your dog isn't even barking. don't worry");
        }

    }
}
