import java.util.Scanner;

public class createrec {
    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char ans[][] = new char[m][n];
        int startingrow = 0;
        int startingcol = 0;
        int endingrow = m - 1;
        int endingcol = n - 1;
        int total = m * n;
        int inc = 0;
        while (count < total) {

            // print first row
            if (inc % 2 == 0) {
                for (int i = startingcol; count < total && i <= endingcol; i++) {
                    ans[startingrow][i] = 'X';
                    count++;
                }
                startingrow++;

                // print last column
                for (int i = startingrow; count < total && i <= endingrow; i++) {
                    ans[i][endingcol] = 'X';
                    count++;
                }
                endingcol--;

                // print ending row
                for (int i = endingcol; i >= startingcol && count < total; i--) {
                    ans[endingrow][i] = 'X';
                    count++;
                }
                endingrow--;

                // print first columm
                for (int i = endingrow; i >= startingrow && count < total; i--) {
                    ans[i][startingcol] = 'X';
                    count++;
                }
                startingcol++;
                inc++;
            } else {
                for (int i = startingcol; count < total && i <= endingcol; i++) {
                    ans[startingrow][i] = 'O';
                    count++;
                }
                startingrow++;

                // print last column
                for (int i = startingrow; count < total && i <= endingrow; i++) {
                    ans[i][endingcol] = 'O';
                    count++;
                }
                endingcol--;

                // print ending row
                for (int i = endingcol; i >= startingcol && count < total; i--) {
                    ans[endingrow][i] = 'O';
                    count++;
                }
                endingrow--;

                // print first columm
                for (int i = endingrow; i >= startingrow && count < total; i--) {
                    ans[i][startingcol] = 'O';
                    count++;
                }
                startingcol++;
                inc++;
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Create a matrix with alternating rectangles of O and X
//GFG
