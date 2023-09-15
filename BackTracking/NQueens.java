package BackTracking;

// place n queens in n rows 
// in such a ways that no two queens can attack on each other
public class NQueens {

    public static void nQueens(char board[][], int row){
        //base case
        if(row == board.length){
            printBoard(board);
            return ;
        }
        //column loop
        for(int j=0; j<board.length; j++){

            if(isSafe(board, row, j)){

                board[row][j] = 'Q' ;
                nQueens(board, row+1); //function call
                board[row][j] = 'x' ;  // backtrack

            }
        }
    }

    public static boolean isSafe(char board[][], int row,int col){
        
        //verticl up
        for(int i= row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // diagonal up left
        for(int i= row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal up right
        for(int i= row-1, j=col+1 ; i>=0 && j<board.length ; i--,j++){
           if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }


    // print board
    public static void printBoard(char board[][]){
        System.out.println("--------Chess Board--------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

   

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        //initialization
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x' ;
            }
        }

        nQueens(board , 0);
    }
}
