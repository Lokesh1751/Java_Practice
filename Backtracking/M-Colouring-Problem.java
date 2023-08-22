//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    public static boolean issafe(int i,int j,int[] color,boolean graph[][],int n){
        for(int k=0;k<n;k++){
            if(graph[i][k]==true && color[k]==j){
                return false;
            }
        }
        return true;
    }
    public static boolean solve(boolean graph[][],int m,int n,int i,int[] color){
        if(i==n){
            return true;
        }
        for(int j=0;j<m;j++){
            if(issafe(i,j,color,graph,n)){
                color[i]=j;
            
            if(solve(graph,m,n,i+1,color)) return true;
            color[i]=-1;
            }
        }
        return false;
    }
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
       int color[]=new int[n];
       for(int i=0;i<n;i++){
          color[i]=-1;
       }
       return solve(graph,m,n,0,color);
    }
}

//GFG
