class Solution {
    public boolean checkTree(TreeNode root) {
        if(root==null){
            return false;
        }
        if(root.val==root.left.val + root.right.val){
            return true;
        }
        return false;
    }
}
//LEETCODE
