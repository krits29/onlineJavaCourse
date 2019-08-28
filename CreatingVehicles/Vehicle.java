/**
 * Created by kritisharma on 8/27/19.
 */
public class Vehicle
{
    private String color;
    private int seats;
    private int speed;
    private int weight;
    protected int maxSpeed;
    private static final int MAX_SPEED = 500;
    private String model;
    private String make;
    private int year;

    public Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void move(int speed)
    {
        if ( speed > MAX_SPEED)
        {
            speed = MAX_SPEED;
        }
        else
        {
            this.speed = speed;
        }

        System.out.println("The vehicle is moving at " + speed);
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
        System.out.println(color);
    }

    public int getSeats()
    {
        System.out.println(seats);
        return seats;
    }

    public void setSeats(int seats)
    {
        this.seats = seats;
    }

    public int getSpeed()
    {
        System.out.println(speed);
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public int getWeight()
    {
        System.out.println(weight);
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        if(maxSpeed < this.maxSpeed)
        {
            this.maxSpeed = maxSpeed;
        }
        else
        {
            this.maxSpeed = MAX_SPEED;
        }

        System.out.println(this.maxSpeed);

    }
}
