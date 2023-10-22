package Greedy_Algorithm;
import java.util.*;

/* Indian Coins
 We are given an infinite supply of denominations 
 [1,2,5,10,20,50,100,500,2000]
 Find min number of coins / notes to make change for a value V.

 V = 121
 ans = 3 (100 + 20 + 1)

 V = 590
 ans = 4 (500 + 50 + 20 +20)
 */
public class IndianCoins {
    public static void main(String[] args) {

        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0 ;
        ArrayList<Integer> ans = new ArrayList<>();
        int amount = 540;

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins ++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total (min) coins used = " + countOfCoins);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
