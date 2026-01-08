package recursion;

public class allPath {
    static int n = 3;
    static boolean[][] visited = new boolean[n][n];

    public static void main(String[] args) {
        printPaths(0, 0, "");
    }

    static void printPaths(int row, int col, String path) {
        // Base case: if we reach the destination
        if (row == n - 1 && col == n - 1) {
            System.out.println(path);
            return;
        }

        // Boundary check and visited check
        if (row < 0 || col < 0 || row >= n || col >= n || visited[row][col]) {
            
            return;
        }

        // Mark current cell as visited
        visited[row][col] = true;

        // Move Down
        printPaths(row + 1, col, path + "D");

        // Move Right
        printPaths(row, col + 1, path + "R");

        // Move Up
        printPaths(row - 1, col, path + "U");

        // Move Left
        printPaths(row, col - 1, path + "L");

        // Backtrack (unmark)
        visited[row][col] = false;
    }
}

