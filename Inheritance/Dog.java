/**
 * Created by kritisharma on 8/27/19.
 */
public class Dog extends Animal // make sure to create a constructor when inheriting or else there will be an error
{
    private int legs;
    private int tail;
    private int eyes;
    private int teeth;
    private String coat;
    private String breed;

    public Dog(String name, int size, int weight, int legs, int tail, int eyes, int teeth, String coat, String breed) {
        super(name, 1, 1, size, weight);
        this.legs = legs;
        this.tail = tail;
        this.eyes = eyes;
        this.teeth = teeth;
        this.coat = coat;
        this.breed = breed;
    }

    public void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    public void moveLegs(int speed)
    {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed)
    {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
