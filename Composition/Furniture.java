/**
 * Created by kritisharma on 8/28/19.
 */
public class Furniture
{
    private int width;
    private int length;
    private int height;
    private String color;
    private String material;

    public Furniture(int width, int length, int height, String color, String material)
    {
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color;
        this.material = material;
    }

    public int getWidth()
    {
        System.out.println(width);
        return width;
    }

    public int getLength()
    {
        System.out.println(length);
        return length;
    }

    public int getHeight()
    {
        System.out.println(height);
        return height;
    }

    public String getColor()
    {
        System.out.println(color);
        return color;
    }

    public String getMaterial()
    {
        System.out.println(material);
        return material;
    }
}
