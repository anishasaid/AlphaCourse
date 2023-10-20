package Greedy_Algorithm;
import java.util.*;

/*you are given n activities with their start and end time 
Select the maximum number of activites that can be performed by a single person,
assuming that a person can only work on a single acivity at
a time. 
Activities are sorted according to end time.

 start = [10,12,20]
 end = [20,25,30]
 ans = 2 (A0 & A2)

 time complexity = O(n)
*/
public class ActivitySelection2 {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        // consider it is not sorted 
        int end[] = {2, 4, 6, 7, 9, 9}; 


        // how to do sorting
        int acticities [][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            acticities[i][0] = i;       // 1st col contain index
            acticities[i][1] = start[i];// 2nd col contain start time 
            acticities[i][2] = end[i];// 3rd col contail end time
        }
        // lambda function -> 
        // Comarator is an interface for sorting java object
        Arrays.sort(acticities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(acticities[0][0]);
        int lastEnd = acticities[0][2];

        for(int i=1; i<end.length; i++){
            if(acticities[i][1] >= lastEnd){
                maxAct ++;
                ans.add(acticities[i][0]);
                lastEnd = acticities[i][2];
            }
        }

        System.out.println("max Activities : "+ maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.println("A"+ans.get(i)+ " ");
        }
        System.out.println();
    }
}
