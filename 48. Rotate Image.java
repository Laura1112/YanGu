//���⣺��һ��n��n�ľ���˳ָ��ת90�ȣ�����ת��ľ���

//�Ƚ��к��жԻ���ע��Ի����Ĳ�Ҫ�ظ���j=i��
//�ٽ�������ע�ⲻҪ�ظ���j<matrix[0].length/2��
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