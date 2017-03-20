/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.
For example,
Given input array nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 * @author Laura
 *
 */

//当给的数组长度不等于0时，若当前值nums[i]!=tag，就让nums[j]=nums[i]，同时j++,并tag = nums[i]，最后返回j即为结果
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
