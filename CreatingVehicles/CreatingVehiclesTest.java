/**
 * Created by kritisharma on 8/27/19.
 */
public class CreatingVehiclesTest
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle("New", "Q5", 2010);

        System.out.println("Vehicle:");

        vehicle.move(70);
        vehicle.setMaxSpeed(260);
        vehicle.setMaxSpeed(600);
        vehicle.setMaxSpeed(350);

        System.out.println("****************************");

        Car car = new Car("new", "7 seater", 2018, 4);

        System.out.println("Car:");


        car.setMaxSpeed(300);
        car.setMaxSpeed(200);
        car.setMaxSpeed(500);

        System.out.println("*****************************");

        Tesla tesla = new Tesla("new", "Model 3", 2018, 4, true, false);

        System.out.println("Tesla:");

        tesla.move(400);
        tesla.setColor("red");
        tesla.setMaxSpeed(500);
        tesla.setMaxSpeed(200);
        tesla.move(400);
        tesla.setMaxSpeed(150);
        tesla.setMaxSpeed(300);





    }
}
