class Solution {
    public String tree2str(TreeNode root) {
        StringBuilder result = new StringBuilder();
        if (root != null) {
            tree2strHelper(root, result);
        }
        return result.toString();
    }

    private void tree2strHelper(TreeNode node, StringBuilder sb) {
        sb.append(node.val);

        if (node.left != null || node.right != null) {
            sb.append('(');
            if (node.left != null) {
                tree2strHelper(node.left, sb);
            }
            sb.append(')');

            if (node.right != null) {
                sb.append('(');
                tree2strHelper(node.right, sb);
                sb.append(')');
            }
        }
    }
}

//LEETCODE
