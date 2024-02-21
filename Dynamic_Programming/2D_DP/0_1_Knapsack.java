import java.util.*;

public class Solution {

public static int solvetab(int[] weight, int[] value, int n, int cap) {
        int dp[][] = new int[n + 1][cap + 1];
        for (int[] row : dp) {
            Arrays.fill(row, 0);
        }
        for (int w = weight[0]; w <= cap; w++) {
            if (weight[0] <= cap) {
                dp[0][w] = value[0];
            } else {
                dp[0][w] = 0;
            }
        }

        for (int idx = 1; idx < n; idx++) { // Change loop condition
            for (int w = 0; w <= cap; w++) {
                int include = 0;
                if (weight[idx] <= w) { // Corrected index
                    include = value[idx] + dp[idx - 1][w - weight[idx]]; // Corrected index
                }
                int exclude = 0+ dp[idx - 1][w];
                dp[idx][w] = Math.max(include, exclude);
            }
        }
        return dp[n-1][cap];
    }

public static int spaceopt(int[] weight, int[] value, int n, int cap) {
        int curr[]=new int[cap+1];
        Arrays.fill(curr, 0);
         for (int w = weight[0]; w <= cap; w++) {
            if (weight[0] <= cap) {
                curr[w] = value[0];
            } else {
                curr[w] = 0;
            }
        }

         for (int idx = 1; idx < n; idx++) { // Change loop condition
            for (int w = cap; w >=0; w--) {
                int include = 0;
                if (weight[idx] <= w) { // Corrected index
                    include = value[idx] + curr[w - weight[idx]]; // Corrected index
                }
                int exclude = 0+ curr[w];
                curr[w] = Math.max(include, exclude);
            }
        }
return curr[cap];
    }

    public static int solvememo(int[] weight, int[] value, int idx, int cap, int dp[][]) {
        if (idx == 0) {
            if (weight[0] <= cap) {
                return value[0];
            } else {
                return 0;
            }
        }
        if (dp[idx][cap] != -1) {
            return dp[idx][cap];
        }
        int include = 0;
        if (weight[idx] <= cap) {
            include = value[idx] + solvememo(weight, value, idx - 1, cap - weight[idx], dp);
        }
        int exclude = 0 + solvememo(weight, value, idx - 1, cap, dp);
        dp[idx][cap] = Math.max(include, exclude);
        return dp[idx][cap];
    }

    public static int solve(int[] weight, int[] value, int idx, int cap) {
        if (idx == 0) {
            if (weight[0] <= cap) {
                return value[0];
            } else {
                return 0;
            }
        }
        int include = 0;
        if (weight[idx] <= cap) {
            include = value[idx] + solve(weight, value, idx - 1, cap - weight[idx]);
        }
        int exclude = 0 + solve(weight, value, idx - 1, cap);
        return Math.max(include, exclude);
    }

    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int dp[][] = new int[n + 1][maxWeight + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        // return solvetab(weight, value, n, maxWeight); // Use n instead of weight.length

        return spaceopt(weight, value, n, maxWeight);
    }
}

//CODESTUDIO
