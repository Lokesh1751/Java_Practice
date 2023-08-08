class Solution {
    public static void checkforisland(char[][] grid,int i,int j,int n,int m){
        if(i<0 || j<0 ||i>=n ||j>=m ||grid[i][j]!='1' ){
            return;
        }
        grid[i][j]='2';
        checkforisland(grid,i-1,j,n,m);
        checkforisland(grid,i+1,j,n,m);
         checkforisland(grid,i,j-1,n,m);
          checkforisland(grid,i,j+1,n,m);
    }
    public int numIslands(char[][] grid) {
        int numofislands=0;
        int n=grid.length;
        if(n==0){
            return 0;
        }
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    checkforisland(grid,i,j,n,m);
                    numofislands+=1;
                }
            }
        }
        return numofislands;
    }
}

//LEETCODE 2D_ARRAY
