//���⣺��һ�����ϵ��¡��������������еĶ�λ�����У�Ѱ���Ƿ����һ����

//���������������1��matrix==null��matrix.length==0��matrix[0].length==0 ��2��target<matrix[0][0]��target>matrix[row-1][col-1]������false
//�ų���������󣬱ȶ�ÿ�����һ������Ŀ��ֵ���ҵ�Ŀ��ֵ���ڵ��У�Ȼ���������ȷ���Ƿ����Ŀ��ֵ
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)      return false;
        int row = matrix.length;
        int col = matrix[0].length;
        if(target<matrix[0][0]||target>matrix[row-1][col-1])
            return false;
        int i=0;
        while(matrix[i][col-1]<target)
            i++;
        int j=0;
        while(matrix[i][j]<target)
            j++;
        if(matrix[i][j]==target)
            return true;
        else
            return false;
    }
}