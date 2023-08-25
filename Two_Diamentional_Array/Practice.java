package Two_D_Array;

public class Practice {
   
    public static void main(String[] args) {
        int array [][ ] = {{1,4,9},
                            {11,4,3},
                            {2,2,3}};
        int sum = 0;

        //sum of 2nd row element 
        for(int j=0;j<array[0].length;j++){
            sum += array[1][j];
        }
        System.out.println("sum is: "+ sum);
    }
}
