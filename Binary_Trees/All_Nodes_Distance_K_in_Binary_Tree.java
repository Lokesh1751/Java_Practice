/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void findparent(    HashMap<TreeNode,TreeNode> hm,TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            hm.put(root.left,root);
        }
        if(root.right!=null){
            hm.put(root.right,root);
        }
        findparent(hm,root.left);
        findparent(hm,root.right);
        return;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        HashMap<TreeNode,TreeNode> hm=new HashMap<>();
        findparent(hm,root);
        Queue<TreeNode> q=new LinkedList<>();
        HashSet<TreeNode> vis=new HashSet<>();
        q.add(target);
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
vis.add(curr);
if(k==0){
    res.add(curr.val);
}
if(hm.containsKey(curr) && !vis.contains(hm.get(curr))){
    q.add(hm.get(curr));
}
if(curr.left!=null && !vis.contains(curr.left)){
    q.add(curr.left);
}
if(curr.right!=null && !vis.contains(curr.right)){
    q.add(curr.right);
}
            }
            k--;
            if(k<0){
                break;
            }
        }
return res;
    }
}
//leetcode
