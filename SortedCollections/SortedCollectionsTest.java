import java.util.Map;

/**
 * Created by kritisharma on 3/27/20.
 */
public class SortedCollectionsTest
{
    private static StockList stockList = new StockList();

    public static void main(String[] args)
    {
        StockItem foodItem = new StockItem("bread", 1.80, 100);
        stockList.addStock(foodItem);

        foodItem = new StockItem("cake", 5.50, 20);
        stockList.addStock(foodItem);

        foodItem = new StockItem("watermelon", 3.20, 40);
        stockList.addStock(foodItem);

        foodItem = new StockItem("bagels", 2.00, 80);
        stockList.addStock(foodItem);

        foodItem = new StockItem("butter", 1.50, 200);
        stockList.addStock(foodItem);

        foodItem = new StockItem("eggs", 2.75, 50);
        stockList.addStock(foodItem);

        System.out.println(stockList);

        for(String s: stockList.items().keySet())
        {
            System.out.println(s);
        }

        ShoppingBasket myBasket = new ShoppingBasket("Corona Quarantine ");
        reserveItem(myBasket, "bread", 2);
        System.out.println(myBasket);

        reserveItem(myBasket, "bagels", 1);
        System.out.println(myBasket);

        reserveItem(myBasket, "cupcake", 1);
        System.out.println(myBasket);

        reserveItem(myBasket, "eggs", 50);
        System.out.println(myBasket);

        unreserveItem(myBasket, "eggs", 20);
        System.out.println(myBasket);

        unreserveItem(myBasket, "butter", 2); //---
        System.out.println(myBasket);

        reserveItem(myBasket, "eggs", 1);

        System.out.println(stockList);

//        foodItem = new StockItem("pen", 0.30); returns an exception error
//        stockList.Items().put(foodItem.getName(), foodItem);  doesn't work

        stockList.items().get("bagels").adjustStock(1000);  //what? unmodifiable something something what
        stockList.get("bagels").adjustStock(-300);       //16.00 or 20.00
        System.out.println(stockList);

        //saying: there is not problem having access to the objects
        //its the collection itself that is unmodifiable and not the objects within it
        //the items method lets it to have access to the stocklist class and retrieve individual items

        for(Map.Entry<String, Double> price: stockList.priceList().entrySet()) //providing an unmodifiablble map of names of prices
        {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }

    }

    public static int reserveItem(ShoppingBasket basket, String item, int quantity)
    {
        //retrieve the item form stock list
        StockItem stockItem = stockList.get(item); //this is getting the actual stock item from the availabe stock
        if(stockItem == null)
        {
            //obviously not in the stock list
            System.out.println("sorry we don't sell that");
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0)  //not equal 0 and have a valid quantity
        {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

    public static int unreserveItem(ShoppingBasket basket, String item, int quantity)
    {
        return basket.removeFromBasket(stockList.get(item), quantity);
    }
}
