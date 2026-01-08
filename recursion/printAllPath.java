package recursion;

import java.util.Arrays;

public class printAllPath {
    static int n = 4;
    static int[][] visited = new int[n][n];
    static boolean[][] visit = new boolean[n][n];

    public static void main(String[] args) {
        //int arr[][]=new int[n][n];
        printPaths(0, 0, "",1);
    }

    static void printPaths(int row, int col, String path,int count) {
        // Base case: if we reach the destination
        if (row == n - 1 && col == n - 1) {
            visited[row][col] = count;
            for(int[] arr: visited){
            System.out.println(Arrays.toString(arr));
            }
            System.out.println(path);
            return;
        }

        // Boundary check and visited check
        if (row < 0 || col < 0 || row >= n || col >= n || visit[row][col]) {
            
            return;
        }

        // Mark current cell as visited
        visited[row][col] = count;
        visit[row][col]= true;

        // Move Down
        printPaths(row + 1, col, path + "D",count+1);

        // Move Right
        printPaths(row, col + 1, path + "R",count+1);

        // Move Up
        printPaths(row - 1, col, path + "U",count+1);

        // Move Left
        printPaths(row, col - 1, path + "L",count+1);

        // Backtrack (unmark)
        visited[row][col] =0;
        visit[row][col]= false;
    }
}
