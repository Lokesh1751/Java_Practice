import java.util.*;

public class Countingsort {
    public static void countintsort(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int count[] = new int[100];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= maxi; i++) {
            count[i] += count[i - 1];
        }
        int output[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[--count[arr[i]]] = arr[i];
        }

        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 3, 4, 1, 6, 4, 3 };
        countintsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
