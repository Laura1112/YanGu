import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 判断给出的数独目前为止是否满足数独条件
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
A partially filled sudoku which is valid.
Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
 * @author Laura
 *
 */

//用hashset存储并分别检查每行、每列、每块是否有重复的；
//每块的循环： for (int k = 0; k < 9; k++) 
//				for (int i = k/3*3; i < k/3*3+3; i++) 
  //  				for (int j = (k%3)*3; j < (k%3)*3+3; j++)

public class Solution {
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> set = new HashSet<Character>();
	    // Check for each row
	    for (int i = 0; i < 9; i++) {
	        for (int j = 0; j < 9; j++) {
	            if (board[i][j] == '.')
	                continue;
	            if (set.contains(board[i][j]))
	                return false;
	            set.add(board[i][j]);
	        }
	        set.clear();
	    }

	    // Check for each column
	    for (int j = 0; j < 9; j++) {
	        for (int i = 0; i < 9; i++) {
	            if (board[i][j] == '.')
	                continue;
	            if (set.contains(board[i][j]))
	                return false;
	            set.add(board[i][j]);
	        }
	        set.clear();
	    }

	    // Check for each sub-grid
	    //以下的循环 理解！！！！理解！！！理解！！！！！
	    for (int k = 0; k < 9; k++) {
	        for (int i = k/3*3; i < k/3*3+3; i++) {
	            for (int j = (k%3)*3; j < (k%3)*3+3; j++) {
	                if (board[i][j] == '.')
	                    continue;
	                if (set.contains(board[i][j]))
	                    return false;
	                set.add(board[i][j]);
	            }
	        }
	        set.clear();
	    }
	    
	    return true;
    }

}
