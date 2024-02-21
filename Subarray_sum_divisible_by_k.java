

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int freq[] = new int[nums.length];
       int count = 0;
       HashMap<Integer, Integer> hm = new HashMap<>();
       
       // Make prefix array
       int sum = nums[0];
       freq[0] = sum;
       for(int i = 1; i < nums.length; i++) {
           sum = sum + nums[i];
           freq[i] = sum;
       }
       
       int moduloarr[] = new int[nums.length];
       for(int i = 0; i < freq.length; i++) {
           int rem = freq[i] % k;
           if(rem < 0) {
               rem = rem + k; // Ensure non-negative
           }
           moduloarr[i] = rem;
       }
       
        for (int i = 0; i < nums.length; i++) {
            if(hm.containsKey(moduloarr[i])){
                count+=hm.get(moduloarr[i]);
                hm.put(moduloarr[i],hm.get(moduloarr[i])+1);
            }
            else{
                hm.put(moduloarr[i],1);
            }
            if(moduloarr[i]==0){
                count++;
            }
        }
       return count;
    }
}

//LEETCODE
