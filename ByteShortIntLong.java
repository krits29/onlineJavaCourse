public class ByteShortIntLong
{
    public static void main(String[] args)
    {
	    int myValue = 10000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Minimum Integer Value = " + myMinValue);
        System.out.println("Maximum Integer Value = " + myMaxValue);

        Byte myMinByteValue = Byte.MIN_VALUE;
        Byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value = " + myMinByteValue);
        System.out.println("Maximum Byte Value = " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Short Value = " + myMinShortValue);
        System.out.println("Maximum Short Value = " + myMaxShortValue);

        long myLongValue = 100L;  //need to put an L an the end of a Long value so that it is recognized as a long value
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long Value = " + myMinLongValue);
        System.out.println("Maximum Long Value = " + myMaxLongValue);

        int myTotal = (myMinValue)/2;

        byte myNewByte = (byte) (myMinByteValue / 2); //tell computer to use byte instead of default int

    }
}
