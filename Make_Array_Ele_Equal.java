//BRUTE FORCE
public class makearrayelementsequal {
    public static boolean check(int arr[]) {
        int ele = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != ele) {
                return false;
            }
        }
        return true;
    }

    // given an integer array goal is to make all elements equal complete one
    // operation you have three options
    // steps: find the largest value in array , find the next largest value in the
    // array it should be strictly smaller than the larger value reduce the first
    // largest value to second largest value

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 2, 5 };
        int op = 0;
        while (check(arr) == false) {
            int maxi = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                maxi = Math.max(maxi, arr[i]);
            }
            int maxi2 = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != maxi) {
                    maxi2 = Math.max(maxi2, arr[i]);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == maxi) {
                    while (arr[i] != maxi2) {
                        arr[i] = arr[i] - 1;
                    }
                    op++;
                }
            }

        }
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(op);
    }
}
//OPTIMIZE APPROACH
import java.util.*;

public class makearreq {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 2, 5 };
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int freq[] = new int[maxi + 1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int cf = 0;
        int op = 0;
        int k = 0;
        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i] > 0) {
                cf += freq[i];
                if (cf != arr.length) {
                    op += cf;
                }

            }
        }
        System.out.println(op);
    }
}

