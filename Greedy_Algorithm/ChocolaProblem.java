package Greedy_Algorithm;
import java.util.*;

// Chocola Problem

/* We are given a bar of chocolate of m X n  square pieces .
 One should break the chocolate into single squares.
 Each break of a part of the chocolate is charged a cost expressed 
 by a positive integer. 
 This cost does not depend on the  size of the part that is 
 being broken but only depends on the line the break goes 
 along .
 Let us denote the costs of breaking along cosecutive vertical
 lines with X1,X2,.......,Xm-1 and along the horizontal lines 
 with y1,y2,......,yn-1 .
 Compute the minimal cost of breaking the whole chocolate into 
 single squares.
*/
public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = {2,1,3,1,4}; // m-1
        Integer costHor[] = {4,1,2}; // n-1

        //sort in decending order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0; // pointers
        int hp = 1 , vp = 1;
        int cost  = 0;

        while(h < costHor.length && v < costVer.length){
            if(costVer[v] <= costHor[h]){
                cost += costHor[h] * vp ; // Horizontal cut
                hp++;
                h++; 
            }else{
                // vertical cut
                cost += costVer[v] * hp;
                vp++;
                v++;
            }
        }

        while(h < costHor.length){
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        while(v < costVer.length){
            cost += costVer[v] * hp;
            vp++;
            v++;
        }
        System.out.println("min cost of cuts = " + cost);
    }
}
