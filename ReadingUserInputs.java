import java.util.Scanner;

public class ReadingUserInputs
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // using a new object; we use 'new' when creatng a new instance

        System.out.println("Enter your year of birth");

        boolean hasNextInt = scanner.hasNextInt(); // needs to be a number

        if ( hasNextInt == true )
        {
            int yearOfBirth = scanner.nextInt(); // for int use scanner.nextInt
            int age = 2019 - yearOfBirth;
            if (age < 0 || age > 100 || yearOfBirth > 2019)
            {
                System.out.println("Sorry please try again. The year you have provided is not valid.");
            }
            else
            {
                scanner.nextLine(); // this line is necessary so that the person can actually enter in a value
                System.out.println("Enter your name : ");
                String name = scanner.nextLine(); // for string use scanner.nextLine
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            }
        }
        else
        {
            System.out.println("Sorry, try again. Please enter a number value");
        }

        scanner.close();
    }
}
