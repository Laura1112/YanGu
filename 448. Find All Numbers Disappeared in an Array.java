import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//题意：找出给定数组中缺失的数，正确的数组应为1 ≤ a[i] ≤ n (n = size of array)，给定数组中的数字出现过1或2次

/*
Input:
[4,3,2,7,8,2,3,1]
Output:
[5,6]*/

//遍历数组，存入TreeSet中，可以去重并排序
//然后从1至n检查set中是否存在，不存在则表示该数缺失

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> rst = new ArrayList<Integer>();
		Set<Integer> set = new TreeSet<Integer>();
		for(int i:nums) set.add(i);
		
		int len = nums.length;
		for(int i=1;i<=len;i++){
		    if(!set.contains(i))
		        rst.add(i);
		}
		return rst;
    }
}
