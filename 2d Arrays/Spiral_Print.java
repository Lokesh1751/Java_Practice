class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int count=0;
        int total=row*col;

        int startingrow=0;
        int startingcol=0;
        int endingrow=row-1;
        int endingcol=col-1;
        while(count<total){

            //print first row
            for(int i=startingcol;count<total && i<=endingcol;i++){
                ans.add(matrix[startingrow][i]);
                count++;
            }
            startingrow++;

            //print last column
            for(int i=startingrow; count<total && i<=endingrow;i++){
ans.add(matrix[i][endingcol]);
count++;
            }
            endingcol--;

            //print ending row
            for(int i=endingcol;i>=startingcol && count<total;i--){
                ans.add(matrix[endingrow][i]);
                count++;
            }
            endingrow--;

            //print first columm
            for(int i=endingrow;i>=startingrow && count<total;i--){
                ans.add(matrix[i][startingcol]);
                count++;
            }
            startingcol++;
        }
        return ans;
    }
}
//LEETCODE
