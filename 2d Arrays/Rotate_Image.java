class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int sol[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sol[j][i]=matrix[i][j];
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            k=0;
            for(int j=m-1;j>=0;j--){
                matrix[i][k++]=sol[i][j];
            }
        }
    }
}

//LEETCODE
