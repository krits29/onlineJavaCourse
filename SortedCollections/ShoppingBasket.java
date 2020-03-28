import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
        this.list = new HashMap<>(); //why?
    }

    public int addToBasket(StockItem item, int quantity)
    {
        if((item != null) && (quantity > 0))
        {
            int inBasket = list.getOrDefault(item, 0);  //check if the specific stock tiem is already in teh basket
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
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
