package Recursion;

//write a function to find the fisrt occurance of an element
// in an array
public class Problem7 {

    public static int firstOccurnce(int arr[],int key, int i){
        //base case
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return  firstOccurnce(arr, key, i+1);
    }
    public static void main(String[] args) {

        int arr[] ={8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurnce(arr, 3, 0));
    }
}
