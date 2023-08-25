import java.util.HashMap;

public class cryptarithmetic {
    public static int getnum(String s, HashMap<Character, Integer> a) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ans += a.get(ch);

        }
        int al = Integer.parseInt(ans);
        return al;
    }

    public static void solution(String unique, int idx, HashMap<Character, Integer> a, boolean usenumbers[],
            String s1, String s2, String s3) {
        if (idx == unique.length()) {
            int num1 = getnum(s1, a);
            int num2 = getnum(s2, a);
            int num3 = getnum(s3, a);

            if (num1 + num2 == num3) {
                for (int i = 0; i < 26; i++) {
                    char ch = (char) ('a' + i);
                    if (a.containsKey(ch)) {
                        System.out.print(ch + ":" + a.get(ch) + " ");
                    }
                }
                System.out.println();
            }
            return;
        }
        char ch = unique.charAt(idx);
        for (int num = 0; num <= 9; num++) {
            if (usenumbers[num] == false) {
                a.put(ch, num);
                usenumbers[num] = true;
                solution(unique, idx + 1, a, usenumbers, s1, s2, s3);
                a.put(ch, -1);
                usenumbers[num] = false;
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "send";
        String s2 = "more";
        String s3 = "money";
        HashMap<Character, Integer> a = new HashMap<>();
        String unique = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!a.containsKey(ch)) {
                a.put(ch, -1);
                unique += ch;
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (!a.containsKey(ch)) {
                a.put(ch, -1);
                unique += ch;
            }
        }

        for (int i = 0; i < s3.length(); i++) {
            char ch = s3.charAt(i);
            if (!a.containsKey(ch)) {
                a.put(ch, -1);
                unique += ch;
            }
        }
        boolean usednumbers[] = new boolean[10];
        for (int i = 0; i < 10; i++) {
            usednumbers[i] = false;
        }
        solution(unique, 0, a, usednumbers, s1, s2, s3);
    }
}
//GFG
