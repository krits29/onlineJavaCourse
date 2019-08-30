/**
 * Created by kritisharma on 8/29/19.
 */
public class Printer
{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter)
    {
        this.tonerLevel = tonerLevel;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int fillUpToner(int percentageFull)
    {
        if ( percentageFull < 0 )
        {
            this.tonerLevel = 0;
            System.out.println("Toner is " + this.tonerLevel + "% full");
        }
        else if ( percentageFull > 100)
        {
            this.tonerLevel = 100;
            System.out.println("Toner is " + this.tonerLevel + "% full");
        }
        else
        {
            this.tonerLevel = percentageFull;
            System.out.println("Toner is " + this.tonerLevel + "% full");
        }
        return this.tonerLevel;
    }

    public int printPages ( int numberOfPages )
    {
        if ( numberOfPages < 0 )
        {
            this.pagesPrinted = 0;
            System.out.println(this.pagesPrinted + " pages are printing");
        }
        else
        {
            this.pagesPrinted = (numberOfPages / 2) + (numberOfPages % 2);
            System.out.println(this.pagesPrinted + " pages are printing");
        }
        return numberOfPages;
    }

    public int getTonerLevel()
    {
        return tonerLevel;
    }

    public int getPagesPrinted()
    {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter()
    {
        return isDuplexPrinter;
    }
}
