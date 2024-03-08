class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int array[][]=new int[m][n];
        for(int row[]:array){
            Arrays.fill(row,0);
        }

        for(int i=0;i<indices.length;i++){
                int value=indices[i][0];
                int value2=indices[i][1];
                for(int k=0;k<array[0].length;k++){
             array[value][k]=array[value][k]+1;
                }

                 for(int k=0;k<array.length;k++){
             array[k][value2]=array[k][value2]+1;
                }
            }
            int cnt=0;
        for(int i=0;i<m;i++){
       for(int j=0;j<n;j++){
          if(array[i][j]%2!=0){
              cnt++;
          }
       }
        }
        return cnt;
    }
}
//LEETCODE
