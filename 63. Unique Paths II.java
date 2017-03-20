//���⣺���һ��m*n�ľ��������Ͻǵ������½��ж�����·�������ϰ�����1��ʾ��ֻ�����»������ƶ�

//��ʼ����һ�к͵�һ�У��������ϰ���������޷��������֮ǰ����ֵ1
//�ټ�������λ�õ�ֵ����Ϊ�ϰ�����Ϊ0������״̬ת�Ʒ���Ϊrst[i][j] = rst[i-1][j]+rst[i][j-1]
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] rst = new int[row][column];
        int m=0,n=0;
        //��ʼ����һ��
        while(m<column&&obstacleGrid[0][m]!=1)
            rst[0][m++] = 1;
        //��ʼ����һ��
        while(n<row&&obstacleGrid[n][0]!=1)
            rst[n++][0] = 1;
        //��������λ�õ�ֵ
        for(int i=1;i<row;i++){
            for(int j=1;j<column;j++){
                if(obstacleGrid[i][j]==1)
                    rst[i][j] = 0;
                else
                    rst[i][j] = rst[i-1][j]+rst[i][j-1];
            }
        }
        return rst[row-1][column-1];
    }
}