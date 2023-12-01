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
    class pair{
        TreeNode node;
        int num;
        pair(TreeNode n,int d){
            this.node=n;
            this.num=d;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q=new LinkedList<>();
        pair p=new pair(root,0);
        q.add(p);
        int ans=0;
        while(!q.isEmpty()){
           int n=q.size();
            int idx=q.peek().num; 
            
            int first=0;
            int last=0;

            for(int i=0;i<n;i++){
                int curridx=q.peek().num-idx;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0) first= curridx;
                if(i==n-1)last=curridx;
                if(node.left!=null){
                    q.add(new pair(node.left,curridx*2+1));
                }
                if(node.right!=null){
                    q.add(new pair(node.right,curridx*2+2));
                }
            }
            ans=Math.max(last-first+1,ans);
        }
        return ans;
    }
}
//LEETCODE
