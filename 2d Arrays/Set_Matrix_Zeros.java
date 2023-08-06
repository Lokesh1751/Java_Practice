class edge{
    int row;
    int col;
    edge(int i,int j){
        this.row=i;
        this.col=j;
    }
}
class Solution {
    public static void placezero(int r,int c,int[][] matrix){
         int collen=matrix[0].length;
        for(int i=0;i<collen;i++){
            matrix[r][i]=0;
        }
        for(int i=0;i<matrix.length;i++){
            matrix[i][c]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
         int collen=matrix[0].length;
        ArrayList<edge> al=new ArrayList<>(); 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<collen;j++){
                if(matrix[i][j]==0){
               al.add(new edge(i,j));
                }
            }
        }
        for(int i=0;i<al.size();i++){
            int r=al.get(i).row;
            int c=al.get(i).col;
            placezero(r,c,matrix);
        }
    }
}

//LEETCODE
