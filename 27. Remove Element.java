/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
Example:
Given input array nums = [3,2,2,3], val = 3
Your function should return length = 2, with the first two elements of nums being 2.
 * @author Laura
 */

//找到不等于指定值的就从nums[0]开始赋值，直接覆盖原来的数组，最后返回被覆盖的长度
public class Solution {
    public static int removeElement(int[] nums, int val) {
    	int j = 0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]!=val){
    			nums[j]=nums[i];
    			j++;
    		}
    	}
        return j;
    }
    
    public static void main(String[] arg){
    	int[] nums = {2,3,4,6,3,2,2,8,5,2,2,2,2};
    	int val = 2;
    		System.out.println(removeElement(nums,val));  	
    }
}