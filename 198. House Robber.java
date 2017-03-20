/**
 * You are a professional robber planning to rob houses along a street. Each
 * house has a certain amount of money stashed, the only constraint stopping you
 * from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses
 * were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of
 * each house, determine the maximum amount of money you can rob tonight without
 * alerting the police.
 * 
 * @author Laura
 * 
 */

//题意：非相邻盗窃的最大数值
//初始状态：rst[0] = nums[0];rst[1] = nums[0]>nums[1]?nums[0]:nums[1];
//状态转移函数：取(rst[i-2]+nums[i])和rst[i-1]中较大的，即rst[i] = (rst[i-2]+nums[i])>rst[i-1]?(rst[i-2]+nums[i]):rst[i-1];
//注意：考虑nums长度为0和1的特殊情况
public class Solution {
	public int rob(int[] nums) {
		int[] rst = new int[nums.length];
		if(nums.length>0){
			rst[0] = nums[0];
			if(nums.length>1){
				rst[1] = nums[0]>nums[1]?nums[0]:nums[1];
				int i=2;
				for(i=2;i<nums.length;i++){
					rst[i] = (rst[i-2]+nums[i])>rst[i-1]?(rst[i-2]+nums[i]):rst[i-1];	//状态转移函数
				}
				return rst[i-1];
			}
			return rst[0];
		}
		return 0;
    }
	
	public static void main(String[] arg){
		int[] nums = {2,1,1,2};
		Solution t = new Solution();
		System.out.println(t.rob(nums));
	}

}
