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
    public List<String> findpath(TreeNode root,String str,List<String> st){
        if(root==null){
            return st;
        }
        if(root.left == null && root.right == null){
            st.add(str + root.val);
            return st;
        }
        findpath(root.left,(str+root.val+"->"),st);
         findpath(root.right,(str+root.val+"->"),st);
         return st;

    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return null;
        }
          List<String> list = new ArrayList<String>();
        findpath(root,"",list);
        return list;
    }
}
//LEETCODE
