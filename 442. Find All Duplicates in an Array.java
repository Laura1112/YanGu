import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//���⣺�ҳ��������ظ������֣���������ֻ���ֹ�1�λ�2��

//����������Ȼ��������Ƚ�nums[i]��nums[i-1]����������������
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