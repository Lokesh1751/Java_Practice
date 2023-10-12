class Solution {
    public void dfs(int image[][],int i,int j,int newcolor,int val){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]==newcolor || image[i][j]!=val){
            return;
        }
        image[i][j]=newcolor;
        dfs(image,i+1,j,newcolor,val);
         dfs(image,i-1,j,newcolor,val);
          dfs(image,i,j-1,newcolor,val);
           dfs(image,i,j+1,newcolor,val);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int val=image[sr][sc];
        dfs(image,sr,sc,color,val);
        return image;
    }
}
//LEETCODE
