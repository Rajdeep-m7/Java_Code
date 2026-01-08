package recursion;

public class nKnight{

    public static void main(String[] args) {
        int n=4;
        char[][] board= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='_';
            }
        }
        solve(board,0,0,n);
    }

    public static void solve(char[][] board, int row, int col, int knight) {
        if(knight==0){
            printBoard(board);
            System.out.println();
            return ;
        }
        if(row>= board.length){
            return;
        }
        if(col ==  board.length){
            solve(board, row+1, 0, knight);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col]='K';
            solve(board, row, col+1, knight-1);
            board[row][col]='_';
        }
        solve(board, row, col+1, knight);

    }

    public static boolean isSafe(char[][] board, int row , int col) {
        if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1] == 'K') return false;
        if (row - 2 >= 0 && col + 1 < board.length && board[row - 2][col + 1] == 'K') return false;
        if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2] == 'K') return false;
        if (row - 1 >= 0 && col + 2 < board.length && board[row - 1][col + 2] == 'K') return false;

        

        return true;
    }

    public static void printBoard(char[][] board) {
        for(char[] row: board){
            for(char c : row){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}