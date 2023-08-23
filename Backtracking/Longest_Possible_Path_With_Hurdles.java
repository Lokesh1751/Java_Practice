class Solution {
public:
     int ans=-1;
    void dfs(int x1,int y1, int x2, int y2,vector<vector<int>>& matrix, int cnt, vector<vector<int>>&vis ){
        
        
        
        if(x1<0 || y1<0|| x1==matrix.size()||y1==matrix[0].size()|| matrix[x1][y1]==0 || vis[x1][y1]==1){
            return;
        }
        if(x1==x2 && y1== y2){
            ans=max(ans,cnt);
            return;
        }
        vis[x1][y1]=1;
        dfs(x1+1,y1,x2,y2,matrix,cnt+1,vis);
        dfs(x1-1,y1,x2,y2,matrix,cnt+1,vis);
        dfs(x1,y1+1,x2,y2,matrix,cnt+1,vis);
        dfs(x1,y1-1,x2,y2,matrix,cnt+1,vis);
        vis[x1][y1]=0;
    }
    

    int longestPath(vector<vector<int>> matrix, int xs, int ys, int xd, int yd)
    {
        vector<vector<int>>vis(matrix.size(), vector<int>(matrix[0].size()));
        if(matrix[xs][ys]==1)
            dfs(xs,ys, xd,yd, matrix,0,vis);
       
       return ans;
    }
};
//GFG
