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
  static int i;
    static List<Integer> ans; 
    public static boolean dfs(TreeNode root,int []v){
        if(root==null){
            return true;
        }
        if(root.val!=v[i++]){
            return false;
        }
        if(root.left!=null && root.left.val!=v[i]){
ans.add(root.val);
return dfs(root.right,v) && dfs(root.left,v);
        }
        else{
            return dfs(root.left,v) && dfs(root.right,v);
        }
    }
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        i=0;
        ans=new ArrayList<>();
        if(dfs(root,voyage)){
            return ans;
        }
        return Arrays.asList(-1);

    }
}
//LEETCODE
