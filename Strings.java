package academy.learnprogramming;

public class Strings
{
    public static void main(String[] args)
    {
        String str = "This is a String";
        System.out.println("My string is equal to " + str);
        str = str + ", and this is more. ";
        System.out.println("My string is equal to: " + str);

        str = str + "\u00A9 2019";
        System.out.println("My string is equal to: " + str);

        String num = "250";
        num = num + "200";
        System.out.println(num);

        String last = "10";
        int i = 50;
        last = last + i;
        System.out.println("LastString is equal to " + last);
        double dnum = 120.35d;
        last = last + dnum;
        System.out.println("LastString is equal to " + last);
    }
}
