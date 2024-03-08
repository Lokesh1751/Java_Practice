class Solution {
    public int diagonalSum(int[][] mat) {
        int s = 0;
        int e = 0;
        int sum = 0;
        
        // Traverse main diagonal
        while (s < mat.length && e < mat[0].length) {
            sum += mat[s][e];
            s++;
            e++;
        } 
        
        s = mat.length - 1;
        e = 0;
        
        // Traverse secondary diagonal
        while (s >= 0 && e < mat[0].length) {
            sum += mat[s][e];
            s--;
            e++;
        }
        
        // Subtract the center element if the matrix is odd-sized
        if (mat.length % 2 == 1) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        
        return sum;
    }
}

//LEETCODE
