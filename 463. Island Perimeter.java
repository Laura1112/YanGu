//���⣺��һ��������������ͨ��һ��ķ�����ܳ�

//(1)�ȱ��������У��������һ�У�����1���ܳ���4�������·��ıȽϣ�������1�����ܳ���2��
//(2)�������һ�У�����1���ܳ���4��
//(3)���������У��������һ�У����ҷ��ıȽϣ�������1�����ܳ���2
public class Solution {
	 public static int islandPerimeter(int[][] grid) {
//		 object [][] array ;
//		 array.length ��������
//		 array [0].length ��������		 
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
