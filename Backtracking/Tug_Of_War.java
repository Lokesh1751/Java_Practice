import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class tugofwar {
    static int mindff = Integer.MAX_VALUE;

    public static void solve(int arr[], int idx, int sums1, int sums2, ArrayList<Integer> a,
            ArrayList<Integer> b) {
        if (idx == arr.length) {
            int diff = Math.abs(sums2 - sums1);
            mindff = Math.min(diff, mindff);
            return;
        }
        if (a.size() < (arr.length + 1) / 2) {
            a.add(arr[idx]);
            sums1 += arr[idx];
            solve(arr, idx + 1, sums1, sums2, a, b);
            sums1 -= arr[idx];
            a.remove(a.size() - 1);
        }
        if (b.size() < (arr.length + 1) / 2) {
            b.add(arr[idx]);
            sums2 += arr[idx];
            solve(arr, idx + 1, sums1, sums2, a, b);
            sums2 -= arr[idx];
            b.remove(b.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 1, 2, 5 };
        int n = arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        solve(arr, 0, 0, 0, a, b);
        System.out.println(mindff);
    }
}
