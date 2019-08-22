/**
 * Created by kritisharma on 8/21/19.
 */
public class CreatingPersonalInfo
{
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName ()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setFirstName(String first)
    {
        this.firstName = first;
    }

    public void setLastName(String last)
    {
        this.lastName = last;
    }

    public void setAge(int years)
    {
        if ( years < 0 || years > 100)
        {
            this.age = 0;
        }
        else
        {
            this.age = years;
        }
    }

    public boolean isTeen()
    {
        if ( this.age < 20 && this.age > 12)
        {
            return true;
        }
        return false;
    }

    public String getFullName()
    {
        if (this.firstName == "")
        {
            return this.lastName;
        }
        else if (this.lastName == "")
        {
            return this.firstName;
        }
        else
        {
            return this.firstName + " " + this.lastName;
        }
    }
}
