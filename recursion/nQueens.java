package recursion;

public class nQueens {
    public static void main(String[] args) {
        int n=4;
        char[][] board= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='_';
            }
        }
        solve(board,0);
    }

    public static void solve(char[][] board, int row) {
        if(row==board.length){
            printBoard(board);
            return ;
        }

        for(int col=0;col<board.length;col++){
            if(isSafe(board,col,row)){
                board[row][col]='Q';
                solve(board, row+1);
                board[row][col]='_'; //backtracking
            }
        }
    }

    public static boolean isSafe(char[][] board, int col , int row) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check top-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check top-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
