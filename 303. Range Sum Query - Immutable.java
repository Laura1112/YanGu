/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
Example:
Given nums = [-2, 0, 3, -5, 2, -1]
sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
 * @author Laura
 *
 */
// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);


//题意：求一个数组中某一段的和
//用一个数组sum[i]存储nums[0]到nums[i-1]的和；最后需要求i到j的和（包含ij）的时候，只需要return sum[j+1]-sum[i]
public class Solution {
	private int[] sum;
	public Solution(int[] nums) {
        sum = new int[nums.length+1];
        sum[0] = 0;
        if(nums.length>0)
        	sum[1] = nums[0];
        for(int i=1;i<nums.length;i++){
        	sum[i+1] = sum[i]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
    	return sum[j+1]-sum[i];       
    }
    
    public static void main(String[] arg){
    	int[] nums = {1,5,2,6,4,8,4};
    	Solution t = new Solution(nums);
    	System.out.println(t.sumRange(3, 3));
    	
    }

}
