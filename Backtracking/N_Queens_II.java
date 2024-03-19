class Solution {
    public int res=0;
    public boolean issafe(char board[][],int row,int col){
      for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }


    return true;
    }
    public void helper(char board[][],int i){
if(i==board.length){
    res++;
    return;
}
for(int idx=0;idx<board[0].length;idx++){
    if(issafe(board,i,idx)){
        board[i][idx]='Q';
        helper(board,i+1);
        board[i][idx]='.';
    }
}
    }
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        helper(board,0);
        return res;
    }
}
//LEETCODE
