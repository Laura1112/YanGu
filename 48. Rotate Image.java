//题意：将一个n×n的矩阵顺指针转90度，求旋转后的矩阵

//先将行和列对换，注意对换过的不要重复（j=i）
//再将列逆序，注意不要重复（j<matrix[0].length/2）
public class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int tmpt = matrix[i][j]; 
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmpt;
            }
        }
        for(int j=0;j<matrix[0].length/2;j++){
            for(int i=0;i<matrix.length;i++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j] = t;
            }
        }
    }
}