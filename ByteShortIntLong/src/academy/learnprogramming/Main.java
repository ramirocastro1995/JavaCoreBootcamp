package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue+1));
        System.out.println("Busted MIN value = " + (myMinIntValue-1));

        /*int myMaxIntTest = 2147483648;*/

        byte myMinByteTest = Byte.MIN_VALUE;
        byte myMaxByteTest = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteTest);
        System.out.println("Byte Max Value = " + myMaxByteTest);

        short myMinShortTest = Short.MIN_VALUE;
        short myMaxShortTest = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortTest);
        System.out.println("Short Max Value = " + myMaxShortTest);

        long myLongValue = 100L;
        long myMinLongTest = Long.MIN_VALUE;
        long myMaxLongTest = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + myMinLongTest);
        System.out.println("long Max Value = " + myMaxLongTest);
        long bigLongLiteralValue = 2147483648L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

    }
}