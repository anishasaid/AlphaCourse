package BackTracking;

public class ArrayB {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void changeArray(int arr[], int ind, int val){
        //base case
        if(ind == arr.length){
            print(arr);
            return;
        }
        //recursion
        arr[ind] = val;
        changeArray(arr, ind+1, val+1);
        arr[ind] = arr[ind]-2;
    }
    public static void main(String[]args){
        int arr[]= new int[10];
        changeArray(arr, 0, 1);
        print(arr);
    }
}
