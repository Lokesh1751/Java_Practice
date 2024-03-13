class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> s=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char c=board[i][j];
               if(c!='.'){
                 if(!s.add("row"+c+i) || !s.add("col"+c+j) || !s.add("grid"+c+(i/3)*3+(j/3))){
                    return false;
                }
               }
            }
        }
        return true;
    }
}
//LEETCODE
