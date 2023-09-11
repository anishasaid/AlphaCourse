package Recursion;

// Tiling Problem "2 x n" board and tiles of size "2 x 1"
//count the number of ways to the given board using the 2x1 tiles
//(A tile can either be placed horizontally or vertically)

public class Problem11 {

    public static int tilingProblem(int n ){//flourSize is 2 X n
        //base case 
        if( n == 0 || n ==1 ){
            return 1;
        }
        //choise
        // vertical 
        int fnm1 = tilingProblem(n-1);

        // horizontal tiling 
        int fnm2 = tilingProblem(n-2);
        
        int totalWays = fnm1 + fnm2;
        return  totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
}
