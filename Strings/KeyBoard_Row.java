import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> ans = new ArrayList<>();

        for (String word : words) {
            if (isSingleRow(word.toLowerCase(), row1) || 
                isSingleRow(word.toLowerCase(), row2) || 
                isSingleRow(word.toLowerCase(), row3)) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }

    private boolean isSingleRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}

//LEETCODE
