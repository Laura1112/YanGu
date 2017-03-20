import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
For example, given numRows = 5,
Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 * @author Laura
 *
 */

//杨辉三角
//list:最外层，即最后结果；subList:存上一行的元素；subList1存当前行元素；
//每行处理完重新定义subList1，并在每行处理结束后把subList1加入list，并把subList1赋值给subList
//若是第一个或最后一个数字，则直接subList1.add(1);
public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> subList = new ArrayList<Integer>();
        for(int i=1;i<=numRows;i++){   
        	List<Integer> subList1 = new ArrayList<Integer>();
        	int j = 0;
        	while(j<i){
        		if(j==0||j==i-1){
        			subList1.add(1);
        			j++;
        		}
        		else{
        			subList1.add(subList.get(j-1)+subList.get(j));
        			j++;
        		}
        	}
        	list.add(subList1);
        	subList = subList1;
        }    
        return list;
    }
    
    public static void main(String[] arg){
    	int n = 6;
    	System.out.println(generate(n));
    }
}