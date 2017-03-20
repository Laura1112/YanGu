import java.util.HashSet;
import java.util.Set;

//���⣺����һ�����־��󣬽�0���ڵ��к��ж����0

//������HashSet��0���ڵ��к���
//�ٱ�������Hash Set�����ν���Ӧ���к��б��0
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




