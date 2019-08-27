/**
 * Created by kritisharma on 8/27/19.
 */
public class InheritanceTest
{
    public static void main(String[] args)
    {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("dog", 1, 5, 4, 1, 2, 32, "slick", "yorkie");

        Fish fish = new Fish("fishy", 1, 1, 2, 2, 2);

        dog.walk();
        dog.run();
        dog.eat();

        fish.rest();
        fish.swim(2);

    }

}
