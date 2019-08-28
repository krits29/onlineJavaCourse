/**
 * Created by kritisharma on 8/27/19.
 */
public class Car extends Vehicle
{
    private int doors;
    private int trunk;
    private int wheels = 4;
    private static final int MAX_CAR_SPEED = 200;
    private static final int DEFAULT_DOORS = 4;

    public Car(String make, String model, int year, int doors)
    {
        super(make, model, year);
        this.doors = doors;
    }

    public Car(String make, String model, int year)
    {
        super(make, model, year);
        this.doors = DEFAULT_DOORS;
    }

    @Override
    public void setMaxSpeed(int maxSpeed)
    {
        if( maxSpeed < MAX_CAR_SPEED)
        {
            this.maxSpeed = maxSpeed;
        }
        else
        {
            this.maxSpeed = MAX_CAR_SPEED;
        }

        System.out.println(this.maxSpeed);
    }
}
