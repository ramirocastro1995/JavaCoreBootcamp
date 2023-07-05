package JavaAlgos;
import java.util.LinkedList;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,3,7,4,2};
        bubblesortfunc(arr);
        for(int i = 0 ; i<arr.length;i++){
            //System.out.println(arr[i]);
        }
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(32);
        ;
        
    }

    public static void bubblesortfunc(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    System.out.println(arr[j+1]);
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        
    }
}
