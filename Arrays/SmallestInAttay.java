package Arrays;
import java.util.*;

public class SmallestInAttay {
    public int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;

        for(int i = 0;i<numbers.length ; i++){
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]){
        SmallestInAttay obj = new SmallestInAttay();
        int numbers[ ] = { 2,5,6,3,4,1};

        System.out.println("Smallest Value is : "+ obj.getSmallest(numbers));
    }
}
