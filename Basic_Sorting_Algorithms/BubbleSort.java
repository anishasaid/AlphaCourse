package Basic_Sorting_Algorithm;

public class BubbleSort {
    
    public static void sorting (int arr[]){
        for(int turn =0 ; turn < arr.length -1 ;turn ++){
            for(int j=0 ; j < arr.length -1 -turn ;j++){
                if(arr[j] > arr[j+1]){
                    //swaping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void  printarr(int arr[]){
        for(int i=0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args ){
        int arr[] = { 5,4,1,3,2};
        sorting(arr);
        printarr(arr);
    }
}
