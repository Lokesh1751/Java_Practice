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
    public static boolean issorted(List<Integer> a){
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i)>=a.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public   List<Integer> ans=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
       
       sol(root);
        return ans;
    }
     public  void sol(TreeNode root){
         if(root==null){
            return ;
        }
        sol(root.left);
        ans.add(root.val);
        sol(root.right);
    }

    public boolean isValidBST(TreeNode root) {
       inorderTraversal(root);
       if(issorted(ans)){
           return true;
       }
       return false;
    }
}

//OPTIMIZE
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
     boolean helper(TreeNode node , Integer low , Integer high){
         if(node==null){
             return true;
         }
         if(high!=null && node.val>=high){
             return false;
         }
         if(low!=null && node.val<=low){
             return false;
         }
         return helper(node.left,low,node.val) && helper(node.right,node.val,high);
     }
    public boolean isValidBST(TreeNode root) {
         return  helper(root,null,null);
    }
}

//LEETCODE
