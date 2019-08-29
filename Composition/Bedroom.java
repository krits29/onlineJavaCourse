/**
 * Created by kritisharma on 8/28/19.
 */
public class Bedroom
{
    private String name;
    private Furniture bed;
    private Furniture chair;
    private Furniture desk;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;

    public Bedroom(String name, Furniture bed, Furniture chair, Furniture desk, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling)
    {
        this.name = name;
        this.bed = bed;
        this.chair = chair;
        this.desk = desk;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
    }

    public String getName()
    {
        return name;
    }

    public Furniture getBed()
    {
        return bed;
    }

    public Furniture getChair()
    {
        return chair;
    }

    public Furniture getDesk()
    {
        return desk;
    }

    public Wall getWall1()
    {
        return wall1;
    }

    public Wall getWall2()
    {
        return wall2;
    }

    public Wall getWall3()
    {
        return wall3;
    }

    public Wall getWall4()
    {
        return wall4;
    }

    public Ceiling getCeiling()
    {
        return ceiling;
    }

    public void makeBed()
    {
        System.out.println("making bed");
    }

    public void doHomework(boolean doingHomework)
    {
        if (doingHomework == true)
        {
            System.out.println("doing homework");
        }
        else
        {
            System.out.println("not right now");
        }
    }

    public void sitDown()
    {
        System.out.println("sitting down");
    }
}
