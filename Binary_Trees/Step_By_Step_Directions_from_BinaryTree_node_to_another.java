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
    public boolean dfs(TreeNode root, StringBuilder sb, int target) {
        
        if(root==null)
            return false;
        
        if(root.val==target)
            return true;
        
        if(dfs(root.left,sb,target)) {
            sb.append("L");
            return true;
        }
        
        if(dfs(root.right,sb,target)) {
            sb.append("R");
            return true;
        }
        
        return false;
    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder start=new StringBuilder("");
        StringBuilder dest=new StringBuilder("");
        StringBuilder ans=new StringBuilder("");
        int i=0;
        int j=0;
        dfs(root,start,startValue);
        dfs(root,dest,destValue);
        System.out.println(start+" "+dest);
        start.reverse();
        dest.reverse();
        while(i<start.length() && j<dest.length()){
            if(start.charAt(i)==dest.charAt(j)){
                i++;
                j++;
            }
            else{
                break;
            }
        }
        while(i<start.length()){
            ans.append("U");
            i++;
        }
        ans.append(dest.substring(j));
        return ans.toString(); 

    }
}
//LEETCODE
