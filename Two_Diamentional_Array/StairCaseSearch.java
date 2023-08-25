package Two_D_Array;

public class StairCaseSearch {

    public static boolean search(int matrix[][], int key){
        int row =0 ,  col = matrix[0].length -1;

        while(row < matrix.length && col>= 0){
            if (matrix[row][col]== key){
                System.out.println("The element is found at ("+ row+ ","+ col+ ")");
                return true;
            }
            else if(key > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("The element is not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};

        int key = 50;
        search(matrix, key);
    }
}
