package Basic_Sorting_Algorithm;

public class InsertionSort {
    public static void sorting (int arr[]){
        for(int i =1 ; i< arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //finding the correct positioin to insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev+ 1 ] = arr[prev];
                prev-- ;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0 ;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args){
        int arr[]= { 5,4,1,3,2};
        sorting(arr);
        printArr(arr);
    }
}
