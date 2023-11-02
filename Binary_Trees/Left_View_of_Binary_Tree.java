class Tree {
    // Helper function to perform DFS and update the left view nodes
    public void printLeftView(Node root, ArrayList<Node> ans, int level) {
        if (root == null) {
            return;
        }

        // Check if the current level is being visited for the first time
        if (level == ans.size()) {
            ans.add(root);
        }

        // Recursively traverse the left and right subtrees
        printLeftView(root.left, ans, level + 1);
        printLeftView(root.right, ans, level + 1);
    }

    // Function to return a list containing elements of the left view of a binary tree.
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Node> ans = new ArrayList<>();

        // Perform DFS to update the left view nodes
        printLeftView(root, ans, 0);

        // Convert the nodes to a list of integers
        ArrayList<Integer> sol = new ArrayList<>();
        for (Node node : ans) {
            sol.add(node.data);
        }

        return sol;
    }
}
//GFG
