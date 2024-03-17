class Solution {
    public String changeit(String s) {
        int cnt = 1;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                temp.append(cnt).append(s.charAt(i));
                cnt = 1;
            } else {
                cnt++;
            }
        }
        temp.append(cnt).append(s.charAt(s.length() - 1));
        return temp.toString();
    }

    public String countAndSay(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            s = changeit(s);
        }
        return s;
    }
}

//LEETCODE
