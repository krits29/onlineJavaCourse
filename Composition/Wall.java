/**
 * Created by kritisharma on 8/28/19.
 */
public class Wall
{
    private String direction;
    private String color;

    public Wall(String direction, String color)
    {
        this.direction = direction;
        this.color = color;
    }

    public String getDirection()
    {
        return direction;
    }

    public String getColor()
    {
        return color;
    }
}
