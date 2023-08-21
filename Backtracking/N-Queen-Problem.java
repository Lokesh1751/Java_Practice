import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static boolean issafe(int row,int col,int [][] board,int n){
        int x=row;
        int y=col;

        //check for col at left side
        while(y>=0){
            if(board[x][y]==1){
                return false;
            }
            y--;
        }

        //check for up diognal
        x=row;
        y=col;
        while(x>=0 && y>=0){
            if(board[x][y]==1){
                return false;
            }
            x--;
            y--;
        }

        
        //check for down diognal
        x=row;
        y=col;
        while(x<n && y>=0){
            if(board[x][y]==1){
                return false;
            }
            y--;
            x++;
        }

        return true;

    }
    public static void addsol(int [][] board, ArrayList<ArrayList<Integer>> ans,int n){
         ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
a.add(board[i][j]);
            }
           
        }
         ans.add(a);
    }
    public static void solve(int col,int [][] board, ArrayList<ArrayList<Integer>> ans,int n){
        if(col==n){
            addsol(board,ans,n);
            return;
        }

        for(int row=0;row<n;row++){
            if(issafe(row,col,board,n)){
                board[row][col]=1;
                solve(col+1,board,ans,n);
                board[row][col]=0;
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> nQueens(int n)
    {
       int [][] board=new int[n][n];
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       solve(0,board,ans,n);
       return ans;
    } 
} 
