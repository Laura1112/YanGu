//题意：算一个矩形里所有连通在一起的方块的周长

//(1)先遍历所有行，除了最后一行，遇到1就周长加4，并与下方的比较，若都是1，则周长减2；
//(2)遍历最后一行，遇到1，周长加4；
//(3)遍历所有列，除了最后一列，与右方的比较，若都是1，则周长减2
public class Solution {
	 public static int islandPerimeter(int[][] grid) {
//		 object [][] array ;
//		 array.length 就是行数
//		 array [0].length 就是列数		 
		 int rst = 0;
		 //(1)
		 for(int i=0;i<grid.length-1;i++){
			 for(int j=0;j<grid[0].length;j++){
				 if(grid[i][j]==1){
					 rst += 4;
					 if(grid[i+1][j]==1)
						 rst -= 2;
				 }
			 }
		 }
		 //(2)
		 for(int j=0;j<grid[0].length;j++){
			 if(grid[grid.length-1][j]==1)
				 rst += 4;
		 }
		 //(3)
		 for(int j=0;j<grid[0].length-1;j++){
			 for(int i=0;i<grid.length;i++){
				 if(grid[i][j]==1){				
					 if(grid[i][j+1]==1)
						 rst -= 2;
				 }
			 }
		 }
	     return rst;
	 }
	 public static void main(String[] args){
		 int grid[][] = {{0,1,1,0}};
		 System.out.println(islandPerimeter(grid));
	 }
}
