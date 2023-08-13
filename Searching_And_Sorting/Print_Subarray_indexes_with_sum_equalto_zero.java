import java.util.*;

public class subar {
    public static void findsum(ArrayList<Integer> al, int s, int e) {
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        if (sum == 0) {
            System.out.println("Subarray found from Index " + s + " to " + e);
        }
    }

    public static void findsubarr(int arr[], int start, int end) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (end == arr.length) {
            return;
        } else if (start > end) {
            findsubarr(arr, 0, end + 1);
        } else {
            ans.clear();
            for (int i = start; i < end; i++) {
                ans.add(arr[i]);
                // System.out.print(arr[i]+" ");
            }
            ans.add(arr[end]);
            findsum(ans, start, end);
            // System.out.println(arr[end]);
            findsubarr(arr, start + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
        findsubarr(arr, 0, 0);
    }
}

//GFG
