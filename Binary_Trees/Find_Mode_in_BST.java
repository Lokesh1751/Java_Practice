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
    private Map<Integer, Integer> freqMap = new HashMap<>();

    public int[] findMode(TreeNode root) {
        inOrder(root);

        List<Integer> modes = new ArrayList<>();
        int maxFreq = 0;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            } else if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                modes = new ArrayList<>();
                modes.add(entry.getKey());
            }
        }
int a[]=new int[modes.size()];
int p=0;
for(Integer i:modes){
    a[p++]=i;
}
        return a;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        freqMap.put(root.val, freqMap.getOrDefault(root.val, 0) + 1);
        inOrder(root.right);
    }
}
//LEETCODE
