package Greedy_Algorithm;

import java.util.*;

/* Given the weights and values of N items , put theese items 
in a knapsack of capacity W to get the maximum total value 
in the knapsack

value = [60,100,120]
weight = [10,20,30]
W = 50
ans = 240
*/
public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        //0th col = idx , ist col = ratio

        for(int i=0; i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)weight[i];
        }
        //Ascending order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalValue = 0;
        
        for(int i=ratio.length-1; i>=0 ; i--){
            int ind = (int)ratio[i][0];
            if(capacity >= weight[ind]){
                finalValue += val[ind]; // include whole item
                capacity -= weight[ind];
            }else{
                //include fractional item
                finalValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("final value = " + finalValue);
    }
}
