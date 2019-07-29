package academy.learnprogramming;

public class KeywordsAndExpressions
{
    public static void main(String[] args)
    {
        // there are like a bazzillion reserved keywords
        // such as int, false, null, etc., etc.

        double km = 100;

        int highScore = 0;

        if(highScore == 50)
        {
            System.out.println("this is an expression");
        }



        int score= 100; // in this case, score = 100, is the expression, but not the semi colon or the int

        if(score > 100)
        {
            System.out.println("you got the high score");
            score = 0;
        }

    }
}
