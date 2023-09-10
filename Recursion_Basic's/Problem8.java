package Recursion;

public class Problem8 {

    public static int lastOccurance(int arr[],int key , int i){
        //base case 
        if(i == arr.length){
            return -1;
        }
        int forwardCheck = lastOccurance(arr, key, i+1);
        if(forwardCheck != -1){
            return forwardCheck;
        }        
        //self check 
        if(arr[i] == key){
            return i;
        }

        return forwardCheck;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,4,2,5,2,3,3,6};
        System.out.println(lastOccurance(arr, 3, 0));
    }
}
