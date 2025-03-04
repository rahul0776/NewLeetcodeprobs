public class Main {
    static int MaximumPath(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Fill first row (can only come from left)
        for (int j = 1; j < m; j++) {
            grid[0][j] += grid[0][j - 1];
        }

        // Fill first column (can only come from above)
        for (int i = 1; i < n; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        // Fill the rest of the grid
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        return grid[n - 1][m - 1]; // Maximum sum path at the bottom-right corner
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {3, 5}};
        System.out.print(MaximumPath(grid)); // Expected output: 8
    }
}
