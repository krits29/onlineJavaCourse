/**
 * Created by kritisharma on 8/26/19.
 */
public class WallArea
{
    public double width;
    public double height;

    public WallArea()
    {
        // default constructor: technically this is already made and isn't really necessary, but whatever
    }

    public WallArea(double width, double height)
    {
        if ( width < 0 )
        {
            width = 0;
        }

        if ( height < 0 )
        {
            height = 0;
        }

        this.width = width;
        this.height = height;
    }

    public double getWidth() // getters must have return types
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setWidth(double width) // remember that a setter doesnt return anything
    {
        if ( width < 0 )
        {
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height)
    {
        if ( height < 0 )
        {
            height = 0;
        }
        this.height = height;
    }

    public double getArea()
    {
        return ( this.height * this.width );
    }
}
