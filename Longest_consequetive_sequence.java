import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else if (nums[i] != nums[i - 1]) {
                currentCount = 1;
            }
        }
        return maxCount;
    }
}

//LEETCODE
