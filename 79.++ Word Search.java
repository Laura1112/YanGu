//���⣺��һ���ַ��������Ƿ�����ַ����������ظ�
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

//��ÿ��λ�ý��еݹ飬����Ѱ��word�е�ÿһ��Ԫ�أ�����ÿ�εݹ鿪ʼ�ͽ���ʱ��ִ��board[x][y] ^=256;�Ա�֤�����ظ���·
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
//board���������ַ�����x���У�y���У�letter������ҵ��ַ����������ʾ��ʽ��i�����ҵ�i���ַ�
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

