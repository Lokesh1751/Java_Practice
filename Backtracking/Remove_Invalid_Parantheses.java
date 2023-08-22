class Solution {
    
    public List<String> removeInvalidParentheses(String s) {
        Set<String> set = new HashSet<>();
        List<String> answer = new ArrayList<>();

        int minRemovals = getMin(s);

        validWays(s, minRemovals, set, answer);

        return new ArrayList<>(answer);
    }

    private int getMin(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    stack.push(ch);
                } else if (stack.peek() == ')') {
                    stack.push(ch);
                } else if (stack.peek() == '(') {
                    stack.pop();
                }
            }
        }
        return stack.size();
    }

    private void validWays(String s, int k, Set<String> set, List<String> answer) {
        
        if(set.contains(s)){
            return;
        }
        set.add(s);
        
        if (k == 0) {
            int isStackEmpty = getMin(s);
            if (isStackEmpty == 0) {
                answer.add(s);
            }
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String first = s.substring(0, i);
            String second = s.substring(i + 1);

            validWays(first + second, k - 1, set, answer);
        }
    }
}

//LEETCODE
