package Stack;
import java.util.*;

// Max Area in Histogram
// Given an array of integers representing the histogram's 
// bar hieght where the width of each bar is 1.
// return the area of the largest ractangle in the histogram.

public class Question8 {

    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next Smaller Right - O(n)
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //Next Smaller Left - O(n)
        s = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Current  Area : 
        // width = j-i-1 = nsr[i] - nsl[i] -1  
        // -> O(n)
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Maximum Area in histogram : "+ maxArea);
    }
    
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; // heights in histogram
        maxArea(arr);
    }
}
