class Solution {
     public  void dfs(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = '#';
        dfs(board, i + 1, j);
        dfs(board, i, j + 1);
        dfs(board, i - 1, j);
        dfs(board, i, j - 1);
    }
    public void solve(char[][] board) {
         int firstrow = 0;
        int lastrow = board.length;
        int firstcol = 0;
        int lastcol = board[0].length;

        for (int i = firstrow; i < lastrow; i++) {
        if (board[i][0] == 'O') {
        dfs(board, i, 0);
        }
        }

        for (int i = firstrow; i < lastrow; i++) {
        if (board[i][lastcol - 1] == 'O') {
        dfs(board, i, lastcol - 1);
        }
        }
        for (int i = firstcol; i < lastcol; i++) {
        if (board[lastrow - 1][i] == 'O') {
        dfs(board, lastrow - 1, i);
        }
        }

        for (int i = firstcol; i < lastcol; i++) {
        if (board[0][i] == 'O') {
        dfs(board, 0, i);
        }
        }

          for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}

//LEETCODE
//Given a matrix of ‘O’ and ‘X’, replace ‘O’ with ‘X’ if surrounded by ‘X’
