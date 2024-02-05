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
    public static TreeNode helper(int l,int h,int[] nums){
        if(l>h)return null;
        int maxi=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=l;i<=h;i++){
       if(maxi<nums[i]){
           maxi=nums[i];
           idx=i;
       }

        }
               TreeNode root=new TreeNode(maxi);
       root.left=helper(l,idx-1,nums);
       root.right=helper(idx+1,h,nums);
       return root;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
          return helper(0,nums.length-1,nums);
    }
}
//LEETCODE
