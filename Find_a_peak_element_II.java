class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int[] arr = new int[2];
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
               if((i == 0 || mat[i][j] > mat[i-1][j]) && 
                  (i == mat.length - 1 || mat[i][j] > mat[i+1][j]) && 
                  (j == 0 || mat[i][j] > mat[i][j-1]) && 
                  (j == mat[0].length - 1 || mat[i][j] > mat[i][j+1])) {
                   arr[0] = i;
                   arr[1] = j;
                   return arr; 
               }
            }
        }
        return arr; 
    }
}
//LEETCODE
