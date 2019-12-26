import java.util.ArrayList;

/**
 * Created by kritisharma on 12/25/19.
 */
public class GroceryList     //using an array list instead of using a traditional array
{                            //it's useful to adding/removing/changin the length and has many more features
    private ArrayList<String> list = new ArrayList<>();   // () is the empty constructor

    public void addItem(String item)
    {
        list.add(item);
    }

    public void printList()
    {
        System.out.println("You have " + list.size() + " items in your grocery list.");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public void modifyList(int element, String newItem)
    {
        list.set(element, newItem);
        System.out.println("Grocery item " + (element + 1) + " has been modified.");
    }

    public void removeItem(int element)
    {
        String item = list.get(element);
        list.remove(element);
    }

    public String findItem(String searchItem)
    {
        //boolean exists = list.contains(searchItem);  GOOD WAY OF SEARCHING

        int position = list.indexOf(searchItem);   // returns the element position of the searched item
        if(position >= 0)
        {
            return list.get(position);
        }

        return null;
    }
}
