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

        for(String s: stockList.Items().keySet())
        {
            System.out.println(s);
        }

        ShoppingBasket myBasket = new ShoppingBasket("Corona Quarantine ");
        sellItem(myBasket, "bread", 2);
        System.out.println(myBasket);

        sellItem(myBasket, "bagels", 1);
        System.out.println(myBasket);

        sellItem(myBasket, "cupcake", 1);
        System.out.println(myBasket);

        sellItem(myBasket, "eggs", 50);
        System.out.println(myBasket);

        sellItem(myBasket, "eggs", 1);

        System.out.println(stockList);

    }

    public static int sellItem(ShoppingBasket basket, String item, int quantity)
    {
        //retireive the item form stock list
        StockItem stockItem = stockList.get(item); //what?
        if(stockItem == null)
        {
            //obviously not in the stocklist
            System.out.println("sorry we dont sell that");
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0)  //not equal 0 and have a valid quantity
        {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
