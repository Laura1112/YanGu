//���⣺��1��n*n����������˳�����n*n�ľ����У����Զ�ά������ʽ����

//��count<n*nʱ��ִ���ĸ�ѭ�����ֱ��ʾ���ҡ����¡���������
public class Solution {
    public int[][] generateMatrix(int n) {
        int sum = n*n;
        int[][] rst = new int[n][n];
        int count=0;
        int i=0,j=0,row_count=0,col_count=0;
        while(count<sum){
            while(count<sum&&j<n-col_count/2){			//����
                count++;
                rst[i][j++]=count;
            }
            i++;j--;row_count++;
            while(count<sum&&i<n-row_count/2){		//����
                count++;
                rst[i++][j]=count;
            }
            i--;j--;col_count++;
            while(count<sum&&j>=col_count/2){			//����
                count++;
                rst[i][j--]=count;
            }
            i--;j++;row_count++;
            while(count<sum&&i>=row_count/2){			//����
                count++;
                rst[i--][j]=count;
            }
            i++;j++;col_count++;
        }
        return rst;
    }
}
