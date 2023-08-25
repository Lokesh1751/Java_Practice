// A Good String is a string which contains only vowels (a,e,i,o,u) . Given a string S, print a single positive integer N where N is the length of the longest substring of S that is also a Good String.

// Note: The time limit for this problem is 1 second, so you need to be clever in how you compute the substrings.

// Input Format
// A string 'S'

// Constraints
// Length of string < 10^5

// Output Format
// A single positive integer N, where N is the length of the longest sub-string of S that is also a Good String.

// Sample Input
// cbaeicde
// Sample Output
// 3
// Explanation
// Longest good substring is "aei"


public class goodstring {
    static int maxi = Integer.MIN_VALUE;

    public static boolean checkpalin(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                continue;
            } else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aeeeiiiioooauuuaeiou";
        int cnt = 0;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                if (checkpalin(str)) {
                    maxi = Math.max(maxi, str.length());
                }
            }
        }
        System.out.println(maxi);
    }
}


