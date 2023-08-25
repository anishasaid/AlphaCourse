package Two_D_Array;
import java.util.*;

public class FindLargest {

    public static void larg(int matrix[][] ){
        int largest = Integer.MIN_VALUE;
        
        for(int i=0 ;i<matrix.length;i++){
            for(int j=0 ; j<matrix[0].length;j++){
                if(matrix[i][j] > largest){
                   largest = matrix[i][j];
                  
                }
                
            }
        }
        System.out.println( "the larest value is:"+ largest);
       
    }
    public static void main(String[] args) {
        int matrix [][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
       // int n=3  ,m=3;

        for(int i=0 ; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0;i<matrix.length;i++){
            for(int j =0 ;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println( );
        }
        //calling function
        larg(matrix);

    }
}
