package BackTracking;
// Find number of ways to reach from (0,0) to (n-1,m-1)
// in a n X m grid
//allowed moves - right or down
public class Grid {

    public static int  gridWays(int i, int j, int n, int m ){
        //basecase
        if(i == n-1 && j == m-1){  // target cell condition
            return 1;
        }
        else if(i == n &&  j == m){  // boundary cross condition
            return 0;
        }

        //recursion
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2 ;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m)); 
    }
}
