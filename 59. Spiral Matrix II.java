//题意：将1至n*n的数按螺旋顺序放入n*n的矩阵中，并以二维数组形式返回

//当count<n*n时，执行四个循环，分别表示向右、向下、向左、向上
public class Solution {
    public int[][] generateMatrix(int n) {
        int sum = n*n;
        int[][] rst = new int[n][n];
        int count=0;
        int i=0,j=0,row_count=0,col_count=0;
        while(count<sum){
            while(count<sum&&j<n-col_count/2){			//向右
                count++;
                rst[i][j++]=count;
            }
            i++;j--;row_count++;
            while(count<sum&&i<n-row_count/2){		//向下
                count++;
                rst[i++][j]=count;
            }
            i--;j--;col_count++;
            while(count<sum&&j>=col_count/2){			//向左
                count++;
                rst[i][j--]=count;
            }
            i--;j++;row_count++;
            while(count<sum&&i>=row_count/2){			//向上
                count++;
                rst[i--][j]=count;
            }
            i++;j++;col_count++;
        }
        return rst;
    }
}
