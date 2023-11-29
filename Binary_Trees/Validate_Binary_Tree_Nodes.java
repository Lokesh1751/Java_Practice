class Solution {
   public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        HashSet<Integer> visitedNodes = new HashSet<>();
        HashSet<Integer> parents = new HashSet<>();

        for (int i = 0; i < n; i++) {
            parents.add(leftChild[i]);
            parents.add(rightChild[i]);
        }

        int rootCandidate = -1;

        for (int i = 0; i < n; i++) {
            if (!parents.contains(i)) {
                if (rootCandidate == -1) {
                    rootCandidate = i;
                } else {
                    return false;  // More than one node without a parent
                }
            }
        }

        if (rootCandidate == -1) {
            return false;  // No node without a parent
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(rootCandidate);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            if (visitedNodes.contains(currentNode)) {
                return false;
            }

            visitedNodes.add(currentNode);

            if (leftChild[currentNode] != -1) {
                queue.add(leftChild[currentNode]);
            }

            if (rightChild[currentNode] != -1) {
                queue.add(rightChild[currentNode]);
            }
        }

        return visitedNodes.size() == n;
    }
}
//LEETCODE
