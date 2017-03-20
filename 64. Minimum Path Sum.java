//求到达二维矩阵最右下角元素的最小路径值和，从最左上角开始，每次只能向右或向下一个

//除了第一行和第一列，到达其余元素的最小路径都满足rst[i][j] = Math.min(rst[i-1][j], rst[i][j-1])+grid[i][j]
//而第一行和第一列都满足rst[i][0] = rst[i-1][0]+grid[i][0]和rst[0][j] = rst[0][j-1]+grid[0][j];
public class Solution {
    public int minPathSum(int[][] grid) {
        int row_count = grid.length;
        int col_count =  grid[0].length;
        int[][] rst = new int[row_count][col_count];
        rst[0][0] = grid[0][0];
        //求第1列的结果（只能从上边来）
        for(int i=1;i<row_count;i++)
        	rst[i][0] = rst[i-1][0]+grid[i][0];
        //求第一行的结果（只能从左边来）
        for(int j=1;j<col_count;j++)
        	rst[0][j] = rst[0][j-1]+grid[0][j];
        //其余结果（只能从左边或上边来）
        for(int i=1;i<row_count;i++){
        	for(int j=1;j<col_count;j++){
        		rst[i][j] = Math.min(rst[i-1][j], rst[i][j-1])+grid[i][j];
        	}
        }
        return rst[row_count-1][col_count-1];
    }
}