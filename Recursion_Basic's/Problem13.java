package Recursion;

//friends pairing problem
public class Problem13 {
   
    public static int friendsPairing(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        // choices
        //sigle
        int fnm1 = friendsPairing(n-1);
        //pairing
        int fnm2 = friendsPairing(n-2);
        int ways = (n-1) * fnm2 ;

        //total ways
        int totalWays = fnm1 + ways ;
        return totalWays;
    }
    
    public static void main(String[] args) {
      System.out.println(friendsPairing(3));
    }
}
