import java.util.ArrayList;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
For example, given k = 3,
Return [1,3,3,1].
 * @author Laura
 *
 */

//每行首位两个数字直接list.add(1),其余相加，每行处理完list_backup=list;
public class Solution {
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> list_backup = new ArrayList<Integer>();
        for(int i=0;i<=rowIndex;i++){
        	List<Integer> list = new ArrayList<Integer>();
        	int j=0;
        	while(j<=i){
        		if(j==0||j==i){
        			list.add(1);
        			j++;
        		}
        		else{
        			list.add(list_backup.get(j-1)+list_backup.get(j));
        			j++;
        		}
        	}
        	list_backup=list;
        }
        return list_backup;
    }

	public static void main(String[] arg){
		int n =4;
		System.out.println(getRow(n));
	}
}
