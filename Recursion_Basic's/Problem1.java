package Recursion;

// Print numbers from n to 1 (Decreasing order)
public class Problem1 {

    public void printDecreasingNumber(int n){

        if(n==1){
            System.out.println(n);
            return ;
        }

        System.out.println(n + " ");
        printDecreasingNumber(n-1);
    }

    public static void main(String [] args){
        Problem1 p = new Problem1();
        int n = 10;
        p.printDecreasingNumber(n);

    }
}
