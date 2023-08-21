// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
     public static boolean issafe(int newx,int newy,int[][] vis,int[][] arr,int n){
        if((newx>=0 && newx<n) && (newy>=0 && newy<n) && 
        vis[newx][newy]!=1 && arr[newx][newy]==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void solve(int x,int y,ArrayList<String> ans,int [][]vis,int [][] arr,String path,int n){
        if(x==n-1 && y==n-1){
            ans.add(path);
            return;
        }
//down
        if(issafe(x+1,y,vis,arr,n)){
            vis[x][y]=1;
            solve(x+1,y,ans,vis,arr,path+'D',n);
            vis[x][y]=0;

        }

        //left
               if(issafe(x,y-1,vis,arr,n)){
            vis[x][y]=1;
            solve(x,y-1,ans,vis,arr,path+'L',n);
            vis[x][y]=0;

        }

        //right
               if(issafe(x,y+1,vis,arr,n)){
            vis[x][y]=1;
            solve(x,y+1,ans,vis,arr,path+'R',n);
             vis[x][y]=0;

        }

        //up
               if(issafe(x-1,y,vis,arr,n)){
            vis[x][y]=1;
            solve(x-1,y,ans,vis,arr,path+'U',n);
             vis[x][y]=0;

        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
                ArrayList<String> ans=new ArrayList<>();
        int [][] vis= new int[n][n];
        String path="";
        if(m[0][0]==0){
            return ans;
        }
        solve(0,0,ans,vis,m,path,n);
        return ans;
    }
}

//GFG
