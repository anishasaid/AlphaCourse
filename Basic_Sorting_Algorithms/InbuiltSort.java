package Basic_Sorting_Algorithm;
import java.util.Arrays;

public class InbuiltSort {
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String [ ] args){
        int arr[]= { 5,4,1,3,2};
        Arrays.sort(arr);
        printarr(arr);
    }
}
