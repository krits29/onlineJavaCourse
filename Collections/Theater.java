import java.util.*;

/**
 * Created by kritisharma on 3/20/20.
 */
public class Theater
{
    public final String theaterName;
    public List<Seat> seats = new ArrayList<>();
    //Better way:
    //private Collection<Seat> seats = new LinkedList<>();

    //theres another way to use the sort method by passing it through a comparator
    //the comparator (similar to comparable) interface defines a single method called compared
    //dont have to implement comparator
    //instead an object of type comparator can be created with a compare method that can sort the objects that we are interested in (seat)
    //more than one can be created
    //either create a comparator object in existing class or create another class that implements the interface

    static final Comparator<Seat> PRICE_ORDER;      //part of the comparator (so theres a semicolon)

    static
    {
        PRICE_ORDER = new Comparator<Seat>()
        {
            @Override
            public int compare(Seat seat1, Seat seat2)
            {
                if (seat1.getPrice() < seat2.getPrice())   //going to sort by the price of the seat
                {
                    return -1;
                }
                else if (seat1.getPrice() > seat2.getPrice())
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        };
    }

    public Theater(String theaterName, int numRows, int seatsperRow)
    {
        this.theaterName = theaterName;
        //  (A + 1) = B according to ASCII table in int that is 65 + 1 = 66
        int lastRow = 'A' + (numRows - 1);   // adding char and int will be int since char is int internally
        for(char row = 'A'; row <= lastRow; row++)  // using char in loop since internally it is int
        {
            for(int seatNum = 1; seatNum <= seatsperRow; seatNum++)
            {
                double price = 12.00;
                if(row < 'D' && seatNum >= 4 && seatNum <= 9)
                {
                    price = 14.00;
                }
                else if(row > 'F' || seatNum < 4 || seatNum > 9)
                {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);  // creates new seat
                seats.add(seat);
            }
        }
    }

    public String getTheaterName()
    {
        return theaterName;
    }

    public boolean reservedSeat(String seatNumber)
    {
        Seat requestedSeat = new Seat(seatNumber, 0.0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0)
        {
            return seats.get(foundSeat).reserve();
        }
        else
        {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        // the above way is faster since you dont have to check every element in the array to find a certain element
        // using the binary search function

        // the following block of code is commented out as it is inefficient


//        for(Seat seat: seats)
//        {
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNumber))
//            {
//                requestedSeat = seat;
//                break;
//            }
//
//        }
//
//        if(requestedSeat == null)
//        {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//
//        return requestedSeat.reserve();
    }

    public Collection<Seat> getSeat()
    {
        return seats;
//        for(Seat seat: seats)
//        {
//            System.out.println(seat.getSeatNumber());
//        }
    }


    //inner class
    public class Seat implements Comparable<Seat>
    {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, Double price)
        {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat seat)
        {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve()
        {
            if(!this.reserved)
            {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " is now reserved");
                return true;
            }
            return false;

        }

        public boolean cancel()
        {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " is cancelled");
                return true;
            }
            return false;

        }

        public String getSeatNumber()
        {
            return seatNumber;
        }

        public double getPrice()
        {
            return price;
        }
    }


}
