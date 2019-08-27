/**
 * Created by kritisharma on 8/27/19.
 */
public class Fish extends Animal
{
    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int gills, int fins, int eyes)
    {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    public void rest()
    {
        System.out.println("fish.rest() was called");
    }

    public void moveMuscles()
    {
        System.out.println("fish.moveMuscles() was called");
    }

    public void moveBackfin()
    {
        System.out.println("fish.moveBackfin() was called");
    }

    public void swim(int speed)
    {
        moveMuscles();
        moveBackfin();
        super.move(speed);
    }

}
