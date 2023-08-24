//Approach 1
import java.util.ArrayList;

public class maxnumber {
    static int max = Integer.MIN_VALUE;

    public static void swapit(char str[], int k) {
        if (k == 0)
            return;

        int n = str.length;

        for (int i = 0; i < n - 1; i++) {
            // Compare it with all digits
            // after it
            for (int j = i + 1; j < n; j++) {
                // if digit at position i
                // is less than digit
                // at position j, swap it
                // and check for maximum
                // number so far and recurse
                // for remaining swaps
                if (str[i] < str[j]) {
                    // swap str[i] with
                    // str[j]
                    char t = str[i];
                    str[i] = str[j];
                    str[j] = t;

                    // If current num is more
                    // than maximum so far
                    String o = String.valueOf(str);
                    int l = Integer.parseInt(o);
                    if (l > max)
                        max = l;

                    // recurse of the other
                    // k - 1 swaps
                    swapit(str, k - 1);

                    // Backtrack
                    char c = str[i];
                    str[i] = str[j];
                    str[j] = c;
                }
            }
        }

    }

    public static void main(String[] args) {
        int m = 3435335;
        int k = 3;
        StringBuilder s = new StringBuilder("");
        s.append(m);
        String an = s.toString();
        char arr[] = an.toCharArray();
        swapit(arr, k);

        System.out.println(max);
    }
}

//GFG
