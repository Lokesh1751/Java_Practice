//Brute force
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            if(sum==k){
                count++;
            }
            for(int j=i+1;j<nums.length;j++){
    sum+=nums[j];
if(sum==k){
    count++;
}
            }
        }
        return count;
    }
}

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
            if(hm.containsKey(sum)){
                hm.put(sum,hm.get(sum)+1);
            }
            else{
                hm.put(sum,1);
            }
        }
        return count;
    }
}
//LEETCODE
