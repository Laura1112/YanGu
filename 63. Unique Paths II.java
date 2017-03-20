//题意：求从一个m*n的矩阵最左上角到最左下角有多少种路径，有障碍，用1表示，只能向下或向右移动

//初始化第一行和第一列，若遇到障碍，则其后都无法到达，遇到之前都赋值1
//再计算其他位置的值，若为障碍，则为0，否则状态转移方程为rst[i][j] = rst[i-1][j]+rst[i][j-1]
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] rst = new int[row][column];
        int m=0,n=0;
        //初始化第一行
        while(m<column&&obstacleGrid[0][m]!=1)
            rst[0][m++] = 1;
        //初始化第一列
        while(n<row&&obstacleGrid[n][0]!=1)
            rst[n++][0] = 1;
        //计算其他位置的值
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