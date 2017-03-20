//���⣺���һ��m*n�ľ��������Ͻǵ������½��ж�����·����ֻ�����»������ƶ�

//����һ�к͵�һ�У�������ʼλ�ã�����ʼ��Ϊ1����Ϊ������Щλ�ö�ֻ��һ��·��
//��һ��һ�е��󵽴�����λ�õ�·������״̬ת�Ʒ���Ϊrst[i][j] = rst[i-1][j]+rst[i][j-1];��ʾ���ﵱǰλ�õĵ�·����������������֮��
public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] rst = new int[m][n];
        //��ʼ����һ�к͵�һ��(������ʼλ��)������ʼ��Ϊ1
        for(int i=0;i<n;i++)
            rst[0][i] = 1;
        for(int j=0;j<m;j++)
            rst[j][0] = 1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++)
                rst[i][j] = rst[i-1][j]+rst[i][j-1];
        }
        return rst[m-1][n-1];
    }
}
