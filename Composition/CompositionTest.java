/**
 * Created by kritisharma on 8/28/19.
 */
public class CompositionTest
{
    public static void main(String[] args)
    {
        Wall wall1 = new Wall("North", "red");
        Wall wall2 = new Wall("South", "red");
        Wall wall3 = new Wall("East", "yellow");
        Wall wall4 = new Wall("East", "yellow");

        Ceiling ceiling = new Ceiling(8, "blue");

        Furniture bed = new Furniture(7, 4, 2, "white", "birch");
        Furniture chair = new Furniture(1, 1, 4, "white", "birch");
        Furniture desk = new Furniture(3, 4, 3, "brown", "oak");

        Bedroom bedroom = new Bedroom("Kriti's room", bed, chair, desk, wall1, wall2, wall3, wall4, ceiling);

        bedroom.doHomework(true);
        bedroom.doHomework(false);

        bedroom.sitDown();
        bedroom.makeBed();

        bed.getColor();
        bed.getHeight();
        bed.getLength();
        bed.getWidth();
        bed.getMaterial();
    }
}
