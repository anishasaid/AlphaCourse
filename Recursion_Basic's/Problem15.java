package Recursion;

//Question 1 : For a given integer array of size N. 
//You have to find all the occurrences(indices) of a given
// element (Key) and print them. Use a recursive function 
//to solve this problem.

public class Problem15 {
    public static int  printOccurance(int arr[],int key,int ind){
        //base case
        if(ind == arr.length){
            return -1;
        }
        if(arr[ind] == key){
            System.out.println(ind);
        }
        return printOccurance(arr, key, ind+1);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,3,2,3,2,6,3};
        int key = 3;
        printOccurance(arr, 3,0);
    }
}
