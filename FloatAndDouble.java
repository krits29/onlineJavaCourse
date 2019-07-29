package academy.learnprogramming;

public class FloatAndDouble
{
    public static void main(String[] args)
    {
	    float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float min value " + minFloat);
        System.out.println("Float max value " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double min value " + minDouble);
        System.out.println("Double max value " + maxDouble);

        int i = 5 / 3;
        float f = (float) 5f / 3f;
        double d = 5d / 3d;
        System.out.println("MyIntValue = " + i);
        System.out.println("MyFloatValue = " + f);
        System.out.println("MyDoubleValue = " + d);

        double lbs = 15;
        double kg = (lbs * 0.45359237);

        System.out.println(lbs + " pounds is " + kg + " kilograms.");

    }
}
