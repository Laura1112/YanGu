import java.util.ArrayList;
import java.util.List;

//���⣺����һ�����־���������״˳��Ľ��
/*
Given the following matrix:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

You should return [1,2,3,6,9,8,7,4,5].
*/

//ѭ�����е��ĸ�ѭ���ֱ��Ӧ���ҡ����¡��������ϣ�����ѭ���γ�����״��ֱ�������ﵽrow*col
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
            while(count<row*col&&j<col-col_count/2){			//����
                rst.add(matrix[i][j++]);
                count++;
            }
            i++;j--;row_count++;
            while(count<row*col&&i<row-row_count/2){		//����
                rst.add(matrix[i++][j]);
                count++;
            }
            i--;j--;col_count++;
            while(count<row*col&&j>=col_count/2){			//����
                rst.add(matrix[i][j--]);
                count++;
            }
            i--;j++;row_count++;
            while(count<row*col&&i>=row_count/2){			//����
                rst.add(matrix[i--][j]);
                count++;
            }
            i++;j++;col_count++;
        }
        return rst;
    }
}