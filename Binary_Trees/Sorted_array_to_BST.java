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
     public TreeNode sortedArrayToBST(int[] arr) {
        if(arr.length==0)return null;
        return bst(arr,0,arr.length-1);
    }

    public TreeNode bst(int arr[], int i, int j){
        if(i>j)return null;

        int mid = i+(j-i)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = bst(arr, i, mid-1);
        node.right = bst(arr, mid+1, j);
        return node;
    }
}
//LEETCODE
