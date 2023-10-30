class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int k[], int t[], int N)
    {
        boolean vis[][]=new boolean[N][N];
        int dx[]={1,1,-1,-1,2,2,-2,-2};
        int dy[]={-2,2,-2,2,-1,1,-1,1};
        
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{k[0]-1,k[1]-1,0});
        while(!q.isEmpty()){
            int a[]=q.poll();
            int x=a[0];
            int y=a[1];
            int c=a[2];
            if(x==t[0]-1 && y==t[1]-1){
                return c;
            }
            for(int i=0;i<8;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if(nx>=0 && nx<N && ny>=0 && ny<N && vis[nx][ny]==false ){
                    vis[nx][ny]=true;
                    q.add(new int[]{nx,ny,c+1});
                }
            }
        }
        return -1;
    }
}
//GFG
