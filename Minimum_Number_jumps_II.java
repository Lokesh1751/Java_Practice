class Solution{
    static int minJumps(int[] nums){
       int jumps = 0, currEnd = 0, currFarthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            currFarthest = Math.max(currFarthest, i + nums[i]);

            if (i == currEnd) {
                if (currFarthest <= i) {
                    return -1;
                }
                currEnd = currFarthest;
                jumps++;
            }
        }

        return jumps;
    }
}
//gfg
