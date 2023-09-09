package Recursion;

// print the numbers in Increasing order
public class Problem2 {

    public static void printIncresingNumber(int n){
        //base case
        if(n == 1){
            System.out.println(n);
            return;
        }

        printIncresingNumber(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        printIncresingNumber(n);
    }
}
