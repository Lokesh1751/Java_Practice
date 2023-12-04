class Solution {
    public int pathSum(
      root, long targetSum) {
        if(root==null){
            return 0;
        }
        ArrayList<Integer> path=new ArrayList<>();
        int[]count=new int[1];
        helper(root,targetSum,count,path);
        return count[0];
    }
    public void helper(TreeNode root,long targetSum,int[] count,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.val);
        long sum=0;
        for(int i=path.size()-1;i>=0;i--){
            sum+=path.get(i);
            if(sum==targetSum){
                count[0]++;
            }
        }
        helper(root.left,targetSum,count,path);
        helper(root.right,targetSum,count,path);
        path.remove(path.size()-1);
    }
}
//LEETCODE
