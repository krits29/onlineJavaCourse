/**
 * Created by kritisharma on 8/27/19.
 */
public class Bike extends Vehicle
{
        private int wheels = 2;
        private static final int MAX_BIKE_SPEED = 100;

        public Bike(String make, String model, int year)
        {
            super(make, model, year);
        }

        @Override
        public void setMaxSpeed(int maxSpeed)
        {
            if( maxSpeed < MAX_BIKE_SPEED)
            {
                this.maxSpeed = maxSpeed;
            }
            else
            {
                this.maxSpeed = MAX_BIKE_SPEED;
            }

        }

}
