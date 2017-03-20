//�󵽴��ά���������½�Ԫ�ص���С·��ֵ�ͣ��������Ͻǿ�ʼ��ÿ��ֻ�����һ�����һ��

//���˵�һ�к͵�һ�У���������Ԫ�ص���С·��������rst[i][j] = Math.min(rst[i-1][j], rst[i][j-1])+grid[i][j]
//����һ�к͵�һ�ж�����rst[i][0] = rst[i-1][0]+grid[i][0]��rst[0][j] = rst[0][j-1]+grid[0][j];
public class Solution {
    public int minPathSum(int[][] grid) {
        int row_count = grid.length;
        int col_count =  grid[0].length;
        int[][] rst = new int[row_count][col_count];
        rst[0][0] = grid[0][0];
        //���1�еĽ����ֻ�ܴ��ϱ�����
        for(int i=1;i<row_count;i++)
        	rst[i][0] = rst[i-1][0]+grid[i][0];
        //���һ�еĽ����ֻ�ܴ��������
        for(int j=1;j<col_count;j++)
        	rst[0][j] = rst[0][j-1]+grid[0][j];
        //��������ֻ�ܴ���߻��ϱ�����
        for(int i=1;i<row_count;i++){
        	for(int j=1;j<col_count;j++){
        		rst[i][j] = Math.min(rst[i-1][j], rst[i][j-1])+grid[i][j];
        	}
        }
        return rst[row_count-1][col_count-1];
    }
}