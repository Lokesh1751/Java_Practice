class Solution {
    public int giveans(int grid[][],int i,int j){
int perimeter=0;
         if(i-1<0){
                        perimeter++;
                    }
                     if(i+1>=grid.length){
                        perimeter++;
                    }
                     if(j-1<0){
                        perimeter++;
                    }
                     if(j+1>=grid[0].length){
                        perimeter++;
                    }
                    if( i-1>=0 && grid[i-1][j]==0){
                        perimeter++;
                    }
                     if( j-1>=0 && grid[i][j-1]==0){
                        perimeter++;
                    }
                     if(i+1<grid.length && grid[i+1][j]==0 ){
                        perimeter++;
                    }
                     if(j+1<grid[0].length && grid[i][j+1]==0){
                        perimeter++;
                    }
                    return perimeter;
    }
    public int islandPerimeter(int[][] grid) {
        int perimeter=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   perimeter+=giveans(grid,i,j);
                }
            }
        }
        return perimeter;
    }
}
//LEETCODE
