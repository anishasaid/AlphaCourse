package Two_D_Array;
import java.util.*;

public class Create2DArray {
    public static boolean search(int matrix[][], int key){
        for(int i=0 ;i<matrix.length;i++){
            for(int j=0 ;j<matrix[0].length ;j++){
                if(matrix[i][j] == key){
                    System.out.println("Element found at ( " + i+ ","+ j+")");  
                    return true;              
                }
            }
        }
        System.out.println("key is not found");
        return false;
    }
    public static void main(String[] args){

        int matrix [][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length , m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix [i][j] = sc.nextInt(); 
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0 ;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        int key = 3;
        search(matrix, key);
    }
}
