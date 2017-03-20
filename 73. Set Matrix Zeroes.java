import java.util.HashSet;
import java.util.Set;

//题意：给定一个数字矩阵，将0所在的行和列都变成0

//用两个HashSet存0所在的行和列
//再遍历两个Hash Set，依次将对应的行和列变成0
public class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> r_set = new HashSet<Integer>();
        Set<Integer> c_set = new HashSet<Integer>();
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    r_set.add(i);
                    c_set.add(j);
                }
            }
        }
        for(int m:r_set){
            for(int n=0;n<col;n++)
                matrix[m][n]=0;
        }
        for(int n:c_set){
            for(int m=0;m<row;m++)
                matrix[m][n]=0;
        }
    }
}




