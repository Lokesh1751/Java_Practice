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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> ans=levelOrder(root);
        List<Integer> sol=new ArrayList<>();
        for(List<Integer> i:ans){
            sol.add(i.get(i.size()-1));
        }
        return sol;
    }
}

//one more solution
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
     public void printLeftView(TreeNode root, ArrayList<TreeNode> ans, int level) {
        if (root == null) {
            return;
        }

        // Check if the current level is being visited for the first time
        if (level == ans.size()) {
            ans.add(root);
        }

        // Recursively traverse the left and right subtrees
        printLeftView(root.right, ans, level + 1);
         printLeftView(root.left, ans, level + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<TreeNode> ans = new ArrayList<>();

        // Perform DFS to update the left view nodes
        printLeftView(root, ans, 0);

        // Convert the nodes to a list of integers
        List<Integer> sol = new ArrayList<>();
        for (TreeNode node : ans) {
            sol.add(node.val);
        }

        return sol;
    }
}
//LEETCODE
