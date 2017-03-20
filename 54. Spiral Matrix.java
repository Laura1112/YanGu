import java.util.ArrayList;
import java.util.List;

//题意：给定一个数字矩阵，求按螺旋状顺序的结果
/*
Given the following matrix:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

You should return [1,2,3,6,9,8,7,4,5].
*/

//循环体中的四个循环分别对应向右、向下、向左、向上，不断循环形成螺旋状，直到个数达到row*col
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> rst = new ArrayList<Integer>();
        if(matrix.length==0)
            return rst;
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        int i=0,j=0,row_count=0,col_count=0;
        while(count<row*col){
            while(count<row*col&&j<col-col_count/2){			//向右
                rst.add(matrix[i][j++]);
                count++;
            }
            i++;j--;row_count++;
            while(count<row*col&&i<row-row_count/2){		//向下
                rst.add(matrix[i++][j]);
                count++;
            }
            i--;j--;col_count++;
            while(count<row*col&&j>=col_count/2){			//向左
                rst.add(matrix[i][j--]);
                count++;
            }
            i--;j++;row_count++;
            while(count<row*col&&i>=row_count/2){			//向上
                rst.add(matrix[i--][j]);
                count++;
            }
            i++;j++;col_count++;
        }
        return rst;
    }
}