class Solution {

  //Using Longest increasing subsequence
  public int helper(int[] nums){
        if(nums.length==0){
            return 0;
        }
        ArrayList<Integer> al=new ArrayList<>();
        al.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>al.get(al.size()-1)){
                al.add(nums[i]);
            }
            else{
                int idx = al.size() - 1;
    while (idx >= 0 && nums[i] <=al.get(idx)) {
        idx--;
    }
    if (idx + 1 < al.size()) {
        al.set(idx + 1, nums[i]);
    } else {
        al.add(nums[i]);
    }
            }
        }
        return al.size();
    }

    public int maxEnvelopes(int[][] envelopes) {
         Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                } else {
                    return b[1] - a[1]; // Sort the second index in descending order
                }
            }
        });
        int[] secondColumn = new int[envelopes.length];

        for (int i = 0; i < envelopes.length; i++) {
            secondColumn[i] = envelopes[i][1]; // Fetching the element at index 1 (second column)
        }
return helper(secondColumn);
    }
}

//leetcode
