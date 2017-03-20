//题意：求一个字符矩阵中是否包含字符串，不能重复
/*For example,
Given board = 
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.
*/

//对每个位置进行递归，依次寻找word中的每一个元素，且在每次递归开始和结束时都执行board[x][y] ^=256;以保证不走重复的路
public class Solution {
    public boolean exist(char[][] board, String word) {
        char[] word_array = word.toCharArray();
        int row = board.length;
        int column = board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(help(board,i,j,word_array,0)) 
                    return true;
            }
        }
        return false;
    }
//board：给定的字符矩阵；x：行；y：列；letter：需查找的字符串的数组表示形式；i：查找第i个字符
    public boolean help(char[][] board,int x,int y,char[] letter,int i){
        int len = letter.length;
        int row = board.length;
        int column = board[0].length;
        if(i==len) return true;
        if(x<0||y<0||x==row||y==column) return false;
        if(board[x][y]!=letter[i])   return false;
        board[x][y] ^=256;
        boolean exist = help(board,x-1,y,letter,i+1)
                        ||help(board,x+1,y,letter,i+1)
                        ||help(board,x,y-1,letter,i+1)
                        ||help(board,x,y+1,letter,i+1);
        board[x][y] ^=256;
        return exist;
    }
}

