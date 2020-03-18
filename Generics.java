import java.util.ArrayList;

/**
 * Created by kritisharma on 3/18/20.
 */
public class Generics
{
    public static void main(String[] args)
    {   // specifiy the type       // not needed to specify here
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("kriti");
        items.add(4);
        items.add(5);

        printDoubled(items);

    }

    private static void printDoubled(ArrayList<Integer> n)
    {
        for(int i: n )   //for (Object i : n)
        {
            //System.out.println((Integer) i * 2);   // no need to specify here already spcified before
            System.out.println(i * 2);
        }
    }
}
