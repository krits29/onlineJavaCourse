package academy.learnprogramming;

public class SwitchStatements
{
    public static void main(String[] args)
    {
        int val = 1;

        if (val == 1)
        {
            System.out.println("value was 1");
        }
        else if( val == 2 )
        {
            System.out.println("value was 2");
        }
        else
        {
            System.out.println("value was neither 1 or 2");
        }

        //----NOW USING THE SWiTCH STATEMENTS-----//

        int switchVal = 1;

        switch (switchVal) // can't test another variable, whereas you can in if else
        {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            // SHORTCUT when you want to do more than one senario

            case 3:case 4:case 5:
                System.out.println("was a 3, 4 , or a 5");
                break;

            default:
                System.out.println("value was not 1 or 2");
                break;

        }

        char charVal = 'A';

        switch (charVal)
        {
            case 'A':
                System.out.println("character was A");
                break;

            case 'B':
                System.out.println("Characer was B");
                break;
            case 'C':
                System.out.println("Character was C");
                break;
            case 'D':
                System.out.println("Character was D");
                break;
            case 'E':
                System.out.println("Character was E");
                break;
            default:
                System.out.println("Character wasn't A, B, C, D, or E");
                break;
        }

        String month = "January";

        switch (month)
        {
            case "January":case "january":
                System.out.println("It's January");
                break;

            case "December":
                System.out.println("It's December");
                break;

            default:
                System.out.println("I'm not sure what just happened");
                break;

        }

    }
}
