/**
 * Created by kritisharma on 8/27/19.
 */
public class Tesla extends Car
{
    private boolean isAutoSteering;
    private boolean isFalconWings;
    private static final int MAX_TESLA_SPEED = 300;

    public Tesla(String make, String model, int year, int doors, boolean isAutoSteering, boolean isFalconWings)
    {
        super(make, model, year, doors);
        this.isAutoSteering = isAutoSteering;
        this.isFalconWings = isFalconWings;
    }

    @Override
    public void setMaxSpeed(int maxSpeed)
    {
        if( maxSpeed < MAX_TESLA_SPEED)
        {
            this.maxSpeed = maxSpeed;
        }
        else
        {
            this.maxSpeed = MAX_TESLA_SPEED;
        }

        System.out.println(this.maxSpeed);
    }
}
