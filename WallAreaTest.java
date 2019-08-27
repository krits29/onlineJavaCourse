/**
 * Created by kritisharma on 8/27/19.
 */
public class WallAreaTest
{
    public static void main(String[] args)
    {
        WallArea wall = new WallArea(5,4);

        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());

        System.out.println("area = " + wall.getArea());
    }
}
