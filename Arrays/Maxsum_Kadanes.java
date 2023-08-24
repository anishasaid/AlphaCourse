package Arrays;

public class Maxsum_Kadanes {

    public static void getMaxSum(int numbers[]){

        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;
        //for loop
        for(int i=0; i<numbers.length; i++){
            currsum = currsum + numbers[i]; //calculate currtent sum
            if(currsum <0){
                currsum = 0;
            }
            maxSum = Math.max(currsum, maxSum);
        }
        System.out.println("maximum sum is :"+ maxSum);
    }
    public static void main(String [] args){
        int numbers[] = { -2,-3,4,-1,-2,1,5,-3};
        getMaxSum(numbers);
    }
}
