import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by kritisharma on 3/27/20.
 */
public class ShoppingBasket
{
    private final String name;
    private final Map<StockItem, Integer> list;

    public ShoppingBasket(String name)
    {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity)
    {
        if((item != null) && (quantity > 0))
        {
            int inBasket = list.getOrDefault(item, 0);  //check if the specific stock item is already in the basket
            list.put(item, inBasket + quantity);
            item.setReservedItems(inBasket + quantity);
            System.out.println("successfully removed");
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity)
    {
        if((list.containsKey(item)) && (quantity < item.getReservedItems()))
        {
            list.replace(item, quantity);
            return item.getReservedItems() - quantity;
        }
        else if((list.containsKey(item)) && (quantity == item.getReservedItems()))
        {
            list.remove(item);
            return 0;
        }
        else
        {
            System.out.println("You cannot un-reserve that");
            return item.getReservedItems();
        }
    }

    public Map<StockItem, Integer> items()
    {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString()
    {
        String str = "\nShopping basket " + name + "contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for(Map.Entry<StockItem, Integer> i : list.entrySet())
        {
            str += i.getKey() + ". " + i.getValue() + " purchased\n";
            totalCost += i.getKey().getPrice() * i.getValue();
        }
        return str + "Total cost: " + totalCost;
    }
}
