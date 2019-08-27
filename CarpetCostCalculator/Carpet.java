/**
 * Created by kritisharma on 8/27/19.
 */
public class Carpet
{
    private double cost;

    public Carpet(double cost)
    {
        if ( cost < 0 )
        {
            cost = 0;
        }
        this.cost = cost;
    }

    public double getCost()
    {
        return cost;
    }

}
