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
public class ActivitySelection {
   
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};  // sorted

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){
                maxAct ++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activities = "+ maxAct);
        for(int i=0 ;i<ans.size();i++){
            System.out.println("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
