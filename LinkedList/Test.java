import java.util.ArrayList;

/**
 * Created by kritisharma on 2/13/20.
 */
public class Test
{
    public static void main(String[] args)
    {
        Customer customer1 = new Customer("Bob", 54.5);
        Customer customer2;

        customer2 = customer1;  // only saving the memory address
                                // so techincally we only have one class
        customer2.setBalance(12.13);    // its updating the first class as well
        System.out.println("Balance for " + customer1.getName() + " is $" + customer1.getBalance());
        //so when it prints, you get 12.13, not 54.5

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++)
        {
            System.out.println("Pos " + i + ": " + intList.get(i));
        }
        System.out.println();

        intList.add(2, 3);  // add the number 3 to index position 2

        for(int i = 0; i < intList.size(); i++)
        {
            System.out.println("Pos " + i + ": " + intList.get(i));
        }


    }


}
