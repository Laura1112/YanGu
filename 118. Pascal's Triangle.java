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

//�������
//list:����㣬���������subList:����һ�е�Ԫ�أ�subList1�浱ǰ��Ԫ�أ�
//ÿ�д��������¶���subList1������ÿ�д���������subList1����list������subList1��ֵ��subList
//���ǵ�һ�������һ�����֣���ֱ��subList1.add(1);
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