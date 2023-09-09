package Recursion;

//find fibonacii number
public class Problem5 {
    public static int fibonaci(int n){
        //base case
        if(n == 0 || n ==1){
            return n;
        }
        int fnm1 = fibonaci(n-1);
        int fnm2 = fibonaci(n-2);
        int fibn = fnm1 + fnm2;
        return fibn;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(fibonaci(n));
    }
}
