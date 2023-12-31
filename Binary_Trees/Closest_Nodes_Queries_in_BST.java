//TLE BRUTE FORCE SOLUTION 
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
    private static int findJustSmaller(List<Integer> arrayList, int targetValue) {
        int justSmaller = Integer.MIN_VALUE;

        for (int num : arrayList) {
            if (num < targetValue && num > justSmaller) {
                justSmaller = num;
            }
        }

        return justSmaller;
    }

    private static int findJustGreater(List<Integer> arrayList, int targetValue) {
        int justGreater = Integer.MAX_VALUE;

        for (int num : arrayList) {
            if (num > targetValue && num < justGreater) {
                justGreater = num;
            }
        }

        return justGreater;
    }

    public List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        sol(root);
        return ans;
    }

    public void sol(TreeNode root) {
        if (root == null) {
            return;
        }
        sol(root.left);
        ans.add(root.val);
        sol(root.right);
    }

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> an = inorderTraversal(root);
        boolean check;
        List<List<Integer>> sol = new ArrayList<>();

        for (Integer i : queries) {
            check = false;
            List<Integer> t = new ArrayList<>();
            for (int j = 0; j < an.size(); j++) {
                if (an.get(j).equals(i)) {
                    t.add(i);
                    t.add(i);
                    check = true;
                    break;
                }
            }
            if (!check) {
                int justSmaller = findJustSmaller(ans, i);
                int justGreater = findJustGreater(ans, i);

                t.add(justSmaller == Integer.MIN_VALUE ? -1 : justSmaller);
                t.add(justGreater == Integer.MAX_VALUE ? -1 : justGreater);
            }
            sol.add(t);
        }
        return sol;
    }
}

//OPTIMIZED SOLUTION
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
    private static int findJustSmaller(List<Integer> arrayList, int targetValue) {
        int justSmaller = Integer.MIN_VALUE;

        for (int num : arrayList) {
            if (num < targetValue && num > justSmaller) {
                justSmaller = num;
            }
        }

        return justSmaller;
    }

    private static int findJustGreater(List<Integer> arrayList, int targetValue) {
        int justGreater = Integer.MAX_VALUE;

        for (int num : arrayList) {
            if (num > targetValue && num < justGreater) {
                justGreater = num;
            }
        }

        return justGreater;
    }

    public List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        sol(root);
        return ans;
    }

    public void sol(TreeNode root) {
        if (root == null) {
            return;
        }
        sol(root.left);
        ans.add(root.val);
        sol(root.right);
    }

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> v = inorderTraversal(root);
        boolean check;


       List<List<Integer>> ans = new ArrayList<>();

        for (int x : queries) {
            int num1 = -1, num2 = -1;
            int first = 0, last = v.size() - 1;

            while (last >= first) {
                int mid = (first + last) / 2;
                if (v.get(mid) <= x) {
                    num1 = v.get(mid);
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }

            first = 0;
            last = v.size() - 1;

            while (last >= first) {
                int mid = (first + last) / 2;
                if (v.get(mid) >= x) {
                    num2 = v.get(mid);
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }

            ans.add(Arrays.asList(num1, num2));
        }

        return ans;
    }
}

//leetcode
