/**
 * Created by kritisharma on 2/13/20.
 */
public class Customer
{
    private String name;
    private double balance;

    public Customer(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()

    {
        return balance;
    }
}
