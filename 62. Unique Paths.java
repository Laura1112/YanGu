//题意：求从一个m*n的矩阵最左上角到最左下角有多少种路径，只能向下或向右移动

//将第一列和第一行（包括开始位置）都初始化为1，因为到达这些位置都只有一种路径
//再一行一行地求到达其他位置的路径数，状态转移方程为rst[i][j] = rst[i-1][j]+rst[i][j-1];表示到达当前位置的的路径数等于上面和左边之和
public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] rst = new int[m][n];
        //初始化第一行和第一列(包括初始位置)，都初始化为1
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
