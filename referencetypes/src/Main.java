import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int [] anotherArray = myIntArray;

        System.out.println("myIntArray =" + Arrays.toString(myIntArray));
        System.out.println("myIntArray =" + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray =" + Arrays.toString(myIntArray));
        System.out.println("myIntArray =" + Arrays.toString(anotherArray));

        anotherArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);
        System.out.println("myIntArray =" + Arrays.toString(myIntArray));
        System.out.println("myIntArray =" + Arrays.toString(anotherArray));

        int[] array ={1,5,3,7,11,9,15};
        System.out.println("array= " + Arrays.toString(array) );
        reverse(array);
        System.out.println("reverse array = " +  Arrays.toString(array));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
        System.out.println("array= " + Arrays.toString(array) );
        reverse(array);
        System.out.println("reverse array = " +  Arrays.toString(array));
    }

    private static void reverse(int[] array){
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i< halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex-i] = temp;
        }
    }
}