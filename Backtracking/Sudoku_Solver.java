import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean issafe(int row,int col,int[][] board,int val){
int n=9;
for(int i=0;i<9;i++){

	//check row
	if(board[row][i]==val){
		return false;
	}

	//check col
	if(board[i][col]==val){
		return false;
	}
	////3*3 matrix check it is a formula to check the element of the 3*3 matrix one by one
	if(board[3*(row/3)+i/3][3*(col/3)+i%3]==val){
		return false;
	}


}
return true;
	}
    public static boolean solve(int[][] board){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(board[i][j]==0){
					for(int val=1;val<=9;val++){
						if(issafe(i,j,board,val)){
							board[i][j]=val;
							boolean furthursol=solve(board);
							if(furthursol){
								return true;
							}
							else{
								board[i][j]=0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	public static void solveSudoku(int[][] sudoku) {
        solve(sudoku);
        
	}
}

//CodeStudio
