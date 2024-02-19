class Solution {
    public static int solve(ArrayList<Integer> nums, int i) {
        if (i >= nums.size()) {
            return 0;
        }
        int inc = solve(nums, i + 2) + nums.get(i);
        int exc = solve(nums, i + 1) + 0;
        return Math.max(inc, exc);
    }

    public static int solvetab(ArrayList<Integer> nums) {
        int dp[] = new int[nums.size()];
        Arrays.fill(dp, -1);
        dp[0] = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            int inc = (i - 2 >= 0 ? dp[i - 2] : 0) + nums.get(i);
            int exc = dp[i - 1] + 0;
            dp[i] = Math.max(inc, exc);
        }
        return dp[nums.size() - 1];
    }

    public static int spaceoptimization(ArrayList<Integer> nums) {
        int n = nums.size();
        int prev2 = 0;
        int prev1 = nums.get(0);
        for (int i = 1; i < n; i++) {
            int inc = prev2 + nums.get(i);
            int exc = prev1 + 0;
            int ans = Math.max(inc, exc);
            prev2 = prev1;
            prev1 = ans;
        }
        return prev1;
    }

    public static int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        for (int i = 1; i < nums.length; i++) {
            al1.add(nums[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            al2.add(nums[i]);
        }
        int ans1 = solvetab(al1);
        int ans2 = solvetab(al2);
        return Math.max(ans1, ans2);
    }
}


//LEETCODE
