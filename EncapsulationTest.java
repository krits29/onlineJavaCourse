/**
 * Created by kritisharma on 8/29/19.
 */
public class EncapsulationTest
{
    public static void main(String[] args)
    {
        Printer printer = new Printer(30, true);

        printer.fillUpToner(70);
        printer.printPages(7);
        printer.isDuplexPrinter();
    }
}
