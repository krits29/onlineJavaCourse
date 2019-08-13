package academy.learnprogramming;

public class AddingWithOverloadedMethods {

    public static void main(String[] args)
    {
        add(3, 4, 5, 23, 5, 3);
    }

    public static int add (int a, int b)
    {
        System.out.println(a + b);
        return (a + b);
    }

    public static int add (int a, int b, int c)
    {
        System.out.println(a + b + c);
        return (a + b + c);
    }

    public static int add (int a, int b, int c, int d)
    {
        System.out.println(a + b + c + d);
        return (a + b + c + d);
    }

    public static int add (int a, int b, int c, int d, int e)
    {
        System.out.println(a + b + c + d + e);
        return (a + b + c + d + e);
    }

    public static int add (int a, int b, int c, int d, int e, int f)
    {
        System.out.println(a + b + c + d + e + f);
        return (a + b + c + d + e + f);
    }
}
