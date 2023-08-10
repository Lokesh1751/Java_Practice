import java.util.*;

public class permutetwoarrays {
    public static boolean Ispossible(int a[], int b[], int k) {
        Arrays.sort(a);
        Arrays.sort(b);
        int ans[] = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            ans[j++] = b[i];
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] + ans[i] < k) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int a[] = { 2, 1, 3 };
        int b[] = { 7, 8, 9 };
        int k = 10;
        // LOGIC => FIRST SORT THE FIRST ARRAY IN ASCENDING ORDER AND 2ND ARRAY IN
        // DESCENDING ORDER
        // AND THEN CHECK THE CONDITION IF A[I]+B[I]<K THEN RETURN FALSE
        if (Ispossible(a, b, k)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

//GFG
//Permute two arrays such that sum of every pair is greater or equal to K
