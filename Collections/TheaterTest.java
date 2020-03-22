/**
 * Created by kritisharma on 3/21/20.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheaterTest
{
    public static void main(String[] args)
    {
        Theater theater = new Theater("MyTheater", 8, 12);
        theater.getSeat();

        if(theater.reservedSeat("A11"))
        {
            System.out.println("Please pay");
        }
        else
        {
            System.out.println("Sorry seat is taken");
        }

        if(theater.reservedSeat("D12"))
        {
            System.out.println("Please pay now");
        }
        else
        {
            System.out.println("Seat already reserved");
        }

        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeat());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theater.Seat> priceSeats = new ArrayList<>(theater.getSeat());
        priceSeats.add(theater.new Seat("B00", 13.00));
        priceSeats.add(theater.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);



    }

    public static void printList(List<Theater.Seat> list)
    {
        for(Theater.Seat seat : list)
        {
            System.out.println(" " + seat.getSeatNumber() + " $"  + seat.getPrice());
        }
        System.out.println("-------------------");
    }

}

