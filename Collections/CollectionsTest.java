import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest
{
    //this was the original way that we did the program
    public static void main(String[] args)
    {
        Theater theater = new Theater("MyTheater", 8, 12);
        theater.getSeat();

        if(theater.reservedSeat("H11"))
        {
            System.out.println("Please pay");
        }
        else
        {
            System.out.println("Sorry seat is taken");
        }

        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theater.reservedSeat("A02"))
        {
            System.out.println("Please pay now");
        }
        else
        {
            System.out.println("Seat already reserved");
        }

        Collections.shuffle(seatCopy);  //shuffle methods...there are also other methods in the collection framework
        System.out.println("Printing seat copy");          //reverse method
        printList(seatCopy);                               //min and max method
        System.out.println("Printing theater.seat");       //swap method
        printList(theater.seats);

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);


    }

    public static void printList(List<Theater.Seat> list)
    {
        for(Theater.Seat seat : list)
        {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println("-------------------");
    }

    public static void sortList(List<? extends Theater.Seat> list)
    {
        for (int i = 0; i < list.size() - 1; i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i).compareTo(list.get(j)) > 0)
                {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
