class Solution {
    public static void solve(int i,int[] candidates,int t, List<Integer> temp, List<List<Integer>> ans){
        if(t==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(t<0){
            return;
        }
       if(i==candidates.length ){
           return;
       }
       //skip the ith index
       //add the ith element
       temp.add(candidates[i]);
       solve(i,candidates,t-candidates[i],temp,ans);
       temp.remove(temp.size()-1);
       solve(i+1,candidates,t,temp,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(0,candidates,target,temp,ans);
        return ans;
    }
}

//LEETCODE
