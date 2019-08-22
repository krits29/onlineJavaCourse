import java.util.Scanner;

public class AddingUserInputs
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // using a new object; we use 'new' when creatng a new instance

        System.out.println("Enter 10 numbers");

        int counter = 1;
        int sum = 0;

        while (counter == 10)
        {
            System.out.println("Enter number #" + counter);


            boolean hasNextInt = scanner.hasNextInt();

            if ( hasNextInt == true)
            {
                int input = scanner.nextInt();
                sum = sum + input;
            }
            else
            {
                System.out.println("Invalid Number");
            }

            counter++;
        }

        System.out.println("the sum of the 10 numbers are " + sum);

        scanner.close();
    }
}
