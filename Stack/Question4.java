package Stack;
import java.util.*;

// Next Greater Element 
//The next greater element of some elememnt x in an array is the 
// first greater element that is to the right of x in the 
// same array.
public class Question4 {
   
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack <Integer> s = new Stack<>();
        int nxtGenerator[]= new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            //while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //if-else
            if(s.isEmpty()){
                nxtGenerator[i] = -1;
            }else{
                nxtGenerator[i] = arr[s.peek()];
            }
            //push
            s.push(i);
        }

        for(int i=0; i< nxtGenerator.length; i++){
            System.out.print(nxtGenerator[i]+" ");
        }
        System.out.println();
    }
}

// next Greater Right
// next Greater Left
// next Smaller Right
// next Smaller Left 