package Arrays;

public class PrintSubArray {
    public void getSubarray(int numbers[]){
        
        for (int i=0;i<numbers.length;i++ ){
            int start = i;
            for(int j =i;j<numbers.length;j++){
                int end = j;

                for(int k = start ;k<= end;k++){ // for loop for printing 
                    System.out.print(numbers[k]); // it gives subarray

                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        PrintSubArray obj = new PrintSubArray();
        int numbers[] = { 2,4,6,8,10}; 
        obj.getSubarray(numbers);
    }
}
