/**
 * Created by kritisharma on 8/21/19.
 */
public class Constructors
{
    String name;
    double credit;
    String email;

    public Constructors() // constructors always have the same name as the class
    {
        this("hello", 200.00, "hi@bye.com");
    }

    public Constructors(String name, double credit)
    {
        this(name, credit, "bye@hi.com");
    }

    public Constructors(String name, double credit, String email)
    {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public double getCredit()
    {
        return credit;
    }

    public String getEmail()
    {
        return email;
    }

}
