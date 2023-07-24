//User function Template for Java

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int l = 0;
        int j = 0;
        int o = 0;
        for (int i = 0; i < n; i++) {
            l++;
            if (l == k || i==n-1) {
                Collections.reverse(arr.subList(j, i + 1));
                l=0;
                j+=k;
            }
        }
    }
}

//GFG
