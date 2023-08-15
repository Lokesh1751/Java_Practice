import java.util.*;

public class ch {
    public static boolean checkarr(int arr[], int n) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);

        int front;
        for (front = 0; front < n; front++) {
            if (temp[front] != arr[front]) {
                break;
            }
        }

        int back;
        for (back = n - 1; back >= 0; back--) {
            if (temp[back] != arr[back]) {
                break;
            }
        }

        if (front >= back) {
            return true;
        }

        do {
            front++;
            if (arr[front - 1] < arr[front]) {
                return false;
            }
        } while (front != back);
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 3 };
        int n = arr.length;
        if (checkarr(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

//Check if reversing a sub array make the array sorted
//GFG
