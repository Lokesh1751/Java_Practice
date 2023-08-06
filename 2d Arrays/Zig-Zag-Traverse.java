import java.util.*;

public class zigzag_traversal {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = 4;
        int m = n;
        int arr[][] = {
               {1,2,3,4},
               {6,7,8,9},
               {11,12,13,14},
               {16,17,18,19}
        };
        int j = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            j = 0;
            k = i;
            if (i == 0 && j == 0) {
                ans.add(arr[i][j]);
                System.out.println(arr[i][j]);
                continue;
            }
            while (k >= 0 && j < m) {
                ans.add(arr[k][j]);
                System.out.print(arr[k][j] + " ");
                k--;
                j++;
            }
            System.out.println();
        }
        int y = 0;
        int e = n - 1;
        for (int i = 1; i < n; i++) {
            e = n - 1;
            y = i;
            while (y <= m - 1) {
                ans.add(arr[e][y]);
                System.out.print(arr[e][y] + " ");
                e--;
                y++;
            }
            if (i != n - 1) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println(ans);
    }
}

//print the 2d array in zig zag diognally order
