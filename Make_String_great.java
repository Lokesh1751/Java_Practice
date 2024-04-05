class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        while (i < str.length() - 1) {
            char c = str.charAt(i);
            char c1 = str.charAt(i + 1);
            if (c == c1 - 32 || c1 == c - 32) {
                str.delete(i, i + 2);
                i = Math.max(i - 1, 0);
            } else {
                i++;
            }
        }
        return str.toString();
    }
}

//LEETCODE
