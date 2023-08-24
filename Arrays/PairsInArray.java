package Arrays;

public class PairsInArray {
    public void printPairs(int numbers[]){
        for(int i=0 ;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j =i+1; j<numbers.length;j++){
                System.out.println("(" + curr+ ","+ numbers[j]+ ")");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        PairsInArray obj = new PairsInArray();
        int numbers [] = {2,4,6,8,10};
        System.out.println("Following are the possible pairs :");
        obj.printPairs(numbers);
    }   
}
