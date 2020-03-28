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

    }
}
