/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> sol=new ArrayList<>();
        if(root==null){
            return sol;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                if(!q.isEmpty()){
                    q.add(null);
                }
                 sol.add(ans);
                ans=new ArrayList<>();
            }
            else{
               ans.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                 if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return sol;
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
         List<List<Integer>> l=levelOrder(root);
         long ans=0;
        List<Long> t=new ArrayList<>();
        long sum=0;
        for(List<Integer> i:l){
            sum=0;
            for(Integer j:i){
sum+=j;
            }
            t.add(sum);
        }
        System.out.print(t);
        Collections.sort(t);
        if(k<0 || k>t.size()){
            return -1;
        }
         return t.get(t.size()-k);

    }
}
//LEETCODE
