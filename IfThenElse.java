package academy.learnprogramming;

public class IfThenElse
{

    public static void main(String[] args)
    {
        boolean isAlien = false;
        if (isAlien == false)
        {
            System.out.println("It's not an alien");
        }
        else
        {
            System.out.println("IT'S AN ALIEN!!!!");
        }

        int topScore = 80;
        if (topScore != 100)
        {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
        {
            System.out.println("Greater than top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <= 90))
        {
            System.out.println("Either or both of the conditions are true.");
        }

        int newVal = 50;
        if (newVal == 50)
        {
            System.out.println("It's equal to 50!");
        }

        boolean isCar = false;
        if(isCar == true)
        {
            System.out.println("this is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
        {
            System.out.println("wasCar is true");
        }


    }
}
