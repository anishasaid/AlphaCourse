package BackTracking;
// count total number of ways in which we can solve N Queens
//Problem
public class NQueens1 {
    public  static void nQueens(char board [][] , int row){
        //base base
        if(row == board.length){
            //printBoard(board);
            count ++;
            return ;
        }

        for(int j=0; j<board.length; j++){
            if(isSafe(board ,row,j )){

                board[row][j] = 'Q';
                nQueens(board, row+1);  // function call
                board[row][j] = 'x';  // backtracking
            }
        }
    }
    //find is it safe place to put queen
    public static boolean isSafe(char board[][], int row , int col){
        //vertically up
        for(int i= row-1 ; i>=0 ;i--){
            if(board[i][col]== 'Q'){
                return false;
            }
        }
        //diagonally up left 
        for(int i=row-1, j = col-1; i>=0 && j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonally up right
        for(int i=row-1 ,j=col+1 ; i>=0 && j<board.length ;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    //print chess board
    public static void printBoard(char board[][]){
        System.out.println("--------Chess Board--------");
        for(int i=0;i<board.length; i++){
            for(int j=0 ;j<board.length ;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int count = 0 ;
    public static void main(String[] args) {
        int n = 5 ;
        char board [][] = new char[n][n];
        // initialize the board
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
        System.out.println("total ways to solve n queens :"+count);
    }
}
