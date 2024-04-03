

class Solution {
    public int partitionString(String s) {
        int count = 0;
        HashSet<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                seen.clear();
                count++;
            }
            seen.add(c);
        }
        if (!seen.isEmpty()) {
            count++;
        }

        return count;
    }
}

//LEETCODE
