import java.util.*;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] targetarray = new int[nums.length];
        Arrays.fill(targetarray, -1);
        for (int i = 0; i < nums.length; i++) {
            if (targetarray[index[i]] == -1) {
                targetarray[index[i]] = nums[i];
            } else {
                int ele = targetarray[index[i]];
                for (int j = targetarray.length - 1; j > index[i]; j--) {
                    targetarray[j] = targetarray[j - 1];
                }
                targetarray[index[i]] = nums[i];
            }
        }
        return targetarray;
    }
}

//LEETCODE
