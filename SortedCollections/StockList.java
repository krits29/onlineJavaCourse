import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by kritisharma on 3/27/20.
 */
public class StockList
{
    private final Map<String, StockItem> list;

    public StockList()
    {
        this.list = new LinkedHashMap<>();  //order specified to the way we entered it
    }

    public int addStock(StockItem item)
    {
        if (item != null)
        {
            StockItem inStock = list.getOrDefault(item.getName(), item); //.getOrDefault saves an extra test for null
            //check if it is already in the stock
            if (inStock != item)
            {
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(), item);

            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity)
    {
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0))
        {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        else
        {
            System.out.println("none in stock");
            return 0;
        }
    }

    public StockItem get(String key)
    {
        return list.get(key);
    }

    public Map<String, StockItem> Items()
    {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString()
    {
        String str = "Stock List\n";
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item :list.entrySet() )
        {
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            str = str + stockItem + ", There are " + stockItem.quantityInStock() + " in stock.";
            str = str + " Value of all the items $" + itemValue + "\n";
            totalCost += itemValue;
        }

        return str + "Total stock value: $" + totalCost;
    }
}
