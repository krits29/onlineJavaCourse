/**
 * Created by kritisharma on 8/26/19.
 */
public class ConstructorsTest
{
    public static void main(String[] args)
    {
        Constructors person1 = new Constructors();
        System.out.println(person1.getName());

        Constructors person2 = new Constructors("Bob", 25000);
        System.out.println(person2.getName());

        Constructors person3 = new Constructors("Tim", 100, "email.com");
        System.out.println(person3.getName());
    }
}
