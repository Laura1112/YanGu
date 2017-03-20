/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */



public class Solution {
    public static int[] twoSum(int[] nums, int target) {
    	int[] result = new int[2];
    	int and;
    	for(int i=0;i<nums.length;i++){
    		for(int j=i+1;j<nums.length;j++){
    			and = nums[i]+nums[j];
    			if(and==target){
    				result[0] = i;
    				result[1] = j;
    				break;
    			}
    		}
    	}
    	return result;
        
    }
    
    public static void main(String arg[]){
    	int[] nums = {0,4,3,0};
    	int target=0;
    	twoSum(nums,target);
    	System.out.println("["+twoSum(nums,target)[0]+","+twoSum(nums,target)[1]+"]");   	//不能直接打印出数组，必须加索引[i]！！！！！
    }
}