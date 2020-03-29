/**
 * Created by kritisharma on 3/27/20.
 */
public class StockItem implements Comparable<StockItem>
{
    private final String name;
    private double price;
    private int quantityStock;
    private int reservedItems;

    public StockItem(String name, double price, int quantityStock)
    {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public StockItem(String name, double price)
    {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getReservedItems()
    {
        return reservedItems;
    }

    public void setReservedItems(int reservedItems)
    {
        this.reservedItems = reservedItems;
        quantityStock -= reservedItems; // correct?
    }

    public void setPrice(double price)
    {
        if(price > 0)
        {
            this.price = price;
        }
    }

    public int quantityInStock()
    {
        if(quantityStock < 0)
        {
            return 0;
        }
        return quantityStock;
    }

    public void adjustStock(int quantityStock)
    {
        int newQuantity = this.quantityStock + quantityStock;
        if(newQuantity >= 0)
        {
            this.quantityStock = quantityStock;
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        System.out.println("StockItem.equals");
        if(obj == this)
        {
            return true;  //its the same if you are comparig to itself
        }

        if((obj == null) || (obj.getClass() != this.getClass()))
        {
            return false;  //cant be null or a different class
        }

        String objName = ((StockItem) obj).getName();  //casting it as stockitem
        return this.name.equals(objName);
    }

    @Override
    public int hashCode()
    {
        return this.name.hashCode() + 31; // using a arbirtaty number
    }

    @Override
    public int compareTo(StockItem o)
    {
        System.out.println("Entering StockItem.compareTo");
        if(this == o)
        {
            return 0;
        }

        if(o != null)
        {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString()
    {
        return this.name + " : Price $" + getPrice();
    }
}
