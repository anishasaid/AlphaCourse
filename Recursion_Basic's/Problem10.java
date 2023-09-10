package Recursion;

// Print X to the power  n (Optimised Answer)
public class Problem10 {

    public static int optimisedPower(int x , int n){
        //base case
        if(n == 0){
            return 1 ;
        }
        //case 1  - n is even 
        int halfPower = optimisedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        
        //case 2 - n is odd 
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2 ;
        int n = 10;
        System.out.println(optimisedPower(x, n));
    }
}
