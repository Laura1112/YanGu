import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//题意：找出数组中重复的数字，所有数字只出现过1次或2次

//对数组排序，然后遍历，比较nums[i]和nums[i-1]，若相等则加入结果中
public class Solution {
	public List<Integer> findDuplicates(int[] nums) {
		Arrays.sort(nums);
		List<Integer> rst = new ArrayList<Integer>();
		int len = nums.length;
		for (int i = 1; i < len; i++) {
			if (nums[i] == nums[i - 1])
				rst.add(nums[i]);
		}
		return rst;
	}

}