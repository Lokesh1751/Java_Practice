import java.util.*;

public class subar {

    public static void findsum(ArrayList<Long> al, long cnt) {
        long sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        if (sum == 0) {
            System.out.println(al);
        }
    }

    public static void findsubarr(long[] arr, int start, int end, long cnt) {
        ArrayList<Long> ans = new ArrayList<>();
        if (end == arr.length) {
            return;
        } else if (start > end) {
            findsubarr(arr, 0, end + 1, cnt);
        } else {
            ans.clear();
            for (int i = start; i < end; i++) {
                ans.add(arr[i]);
                // System.out.print(arr[i]+" ");
            }
            ans.add(arr[end]);
            findsum(ans, cnt);
            // System.out.println(arr[end]);
            findsubarr(arr, start + 1, end, cnt);
        }
    }

    public static void main(String[] args) {
        long arr[] = { 6, -1, -3, 4, -2, 2, 4, 6, -12, -7 };

        long cnt = 0;
        findsubarr(arr, 0, 0, cnt);

    }
}

//GFG
