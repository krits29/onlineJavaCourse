/**
 * Created by kritisharma on 8/30/19.
 */
public class Polymorphism
{
    public static void main(String[] args)
    {
        Car mycar = new Car(6, "my car");
        System.out.println(mycar.startEngine());
        System.out.println(mycar.accelerate());
        System.out.println(mycar.brake()+"\n");

        Car c = new BMW(8, "my bmw");      //new BMW type Car
        System.out.println(c.brake());
        System.out.println(c.accelerate());
        System.out.println(c.startEngine()+"\n");

        c = new Tesla(8, "my tesla");     //not doing Tesla t = new Tesla
        System.out.println(c.brake());    //actually doing  Car c = new Tesla
        System.out.println(c.accelerate());
        System.out.println(c.startEngine()+"\n");

        c = new Audi(8, "my audi");
        System.out.println(c.brake());
        System.out.println(c.accelerate());
        System.out.println(c.startEngine());
    }
}

class Car
{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name)
    {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine()
    {
        return "Car - startEngine()";
    }

    public String accelerate()
    {
        return "Car - accelerate()";
    }

    public String brake()
    {
        return "Car - brake()";
    }

    public int getCylinders()
    {
        return cylinders;
    }

    public String getName()
    {
        return name;
    }
}

class BMW extends Car
{
    public BMW(int cylinders, String name)
    {
        super(cylinders, name);
    }

    @Override
    public String startEngine()
    {
        return "BMW - startEngine()";
    }

    @Override
    public String accelerate()
    {
        return "BMW - accelerate()";
    }

    @Override       // just an annotation because the other method is getting overridden
    public String brake()
    {
        return "BMW - brake";
    }
}

class Tesla extends Car
{
    public Tesla(int cylinders, String name)
    {
        super(cylinders, name);
    }

    @Override
    public String startEngine()
    {
        return "Tesla - startEngine()";
    }

    @Override
    public String accelerate()
    {
        return "Tesla - accelerate()";
    }

    @Override
    public String brake()
    {
        return "Tesla - brake";
    }
}

class Audi extends Car
{
    public Audi(int cylinders, String name)
    {
        super(cylinders, name);
    }

    @Override
    public String startEngine()
    {
        return "Audi - startEngine()";
    }

    @Override
    public String accelerate()
    {
        return "Audi - accelerate()";
    }

    @Override
    public String brake()
    {
        return "Audi - brake";
    }
}
