import java.util.ArrayList;

/**
 * Created by kritisharma on 2/12/20.
 */
public class Contacts
{
    private ArrayList<String> list = new ArrayList<>();

    public void addContact(String name)
    {
        if(list.contains(name) == true)
        {
            System.out.println(name + " already exists");
        }
        else
        {
            list.add(name);
            System.out.println("Contact is added");
        }


    }

    public void modifyContact(int element, String newContact)
    {
        list.set(element, newContact);
        System.out.println("Contact name " + element + 1 + " has been modified.");
    }

    public void removeContact(int element)
    {
        list.remove(element);
        System.out.println("Contact was removed");
    }

    public boolean findContact(String findItem)
    {
        if(list.contains(findItem) == true)
        {
            System.out.println(findItem + " exists");
            return true;
        }
        else
        {
            System.out.println(findItem + " does not exist");
            return false;
        }
    }

    public void print()
    {
        System.out.println("There are " + list.size() + " contacts on your contact list");

        for(int i = 0; i < list.size(); i++)    //use size instead of .length to find the size of an array list
        {
            System.out.println((i + 1) + ". " + list.get(i));  //use get instead of [] to return the value at a specific index
        }
    }
}
