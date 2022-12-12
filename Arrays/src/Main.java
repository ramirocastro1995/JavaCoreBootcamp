import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//        //myIntArray[5] = 50;
//        //myIntArray = {1,2,3,4,5,6,7,8,9,10};
//
//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[1]);
//        System.out.println(myIntArray[2]);
//        System.out.println(myIntArray[3]);
//
//        int [] myNewIntArray = new int[10];
//        for(int i = 0; i<myNewIntArray.length;i++) {
//            myNewIntArray[i] = i * 10;
//        }
//        printArray(myNewIntArray);
//    }
//    public static void printArray(int[] array) {
//        for(int i=0; i<array.length;i++){
//            System.out.println("Element " + i + " ,value is " + array[i]);
//        }
//    }
        int[] myIntegers = getIntegers(5);
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter" + number + " integer values. \r");
        int[] values = new int [number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
}