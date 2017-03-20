import java.util.HashMap;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * @author Laura
 *
 */
public class Solution {
	public static int[] moveZeroes(int[] nums) {
		int count=0;
		int j=0;
		//�����з������ַ���ǰ�棬���ж��ٸ��㣬����������������Щ��
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0)
				count++;
			else
				nums[j++]=nums[i];		
		}
		for(int k=0;k<count;k++){
			nums[j++]=0;
		}  
		return nums;
    }
	
	public static void main(String[] arg){
		int[] nums = {0,2,5,3,0,0,5,5};
		for(int i=0;i<nums.length;i++)
			System.out.println(moveZeroes(nums)[i]);
	}

}
