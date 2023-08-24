package Arrays;
import java.util.*;

public class LargestInArray {
    public int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
    
        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    
    public static void main(String args[]){
        LargestInArray obj =new  LargestInArray();
        int numbers[] = {1,2,5,4,3};
        System.out.println("Largerst Value is: "+ obj.getLargest(numbers));
    }
}

