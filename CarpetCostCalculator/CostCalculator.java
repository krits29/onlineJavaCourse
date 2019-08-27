/**
 * Created by kritisharma on 8/27/19.
 */
public class CostCalculator
{
    private Floor floor;
    private Carpet carpet;

    public CostCalculator(Floor floor, Carpet carpet)
    {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost()
    {
        return ( this.floor.getArea() * this.carpet.getCost() );
    }
}
