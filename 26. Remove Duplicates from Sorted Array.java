/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.
For example,
Given input array nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 * @author Laura
 *
 */

//���������鳤�Ȳ�����0ʱ������ǰֵnums[i]!=tag������nums[j]=nums[i]��ͬʱj++,��tag = nums[i]����󷵻�j��Ϊ���
public class Solution {
	public static int removeDuplicates(int[] nums) {		
		int j=0;
		if(nums.length!=0){
			int tag = nums[0];
			j=1;
			for(int i=1;i<nums.length;i++){
				if(nums[i]!=tag){
					nums[j]=nums[i];
					j++;
				}
				tag = nums[i];
			}
		}
		return j;
    }
	
	public static void main(String[] arg){
		int[] nums = {};
		System.out.println(removeDuplicates(nums));
	}

}
