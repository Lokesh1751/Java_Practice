import java.util.Arrays;

class Solution {
    public int mini = Integer.MAX_VALUE;
    
    public int helper(int[][] grid, int i, int j, int[][] dp) {
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j]; // Return the value at the bottom-right cell
        }
        
        if (dp[i][j] != -1) {
            return dp[i][j]; // If already computed, return the memoized value
        }
        
        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;
        
        if (i < grid.length - 1) {
            right = helper(grid, i + 1, j, dp); // Recurse down
        }
        if (j < grid[0].length - 1) {
            down = helper(grid, i, j + 1, dp); // Recurse right
        }
        
        // Choose the minimum of right and down paths
        dp[i][j] = Math.min(right, down) + grid[i][j]; // Add current cell value to the minimum of right and down paths
        return dp[i][j];
    }

    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] row : dp) {
            Arrays.fill(row, -1); // Initialize dp array with -1
        }
        return helper(grid, 0, 0, dp); // Start the recursive traversal with memoization
    }
}

//LEETCODE
