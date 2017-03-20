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

//���⣺�����ڵ��Ե������ֵ
//��ʼ״̬��rst[0] = nums[0];rst[1] = nums[0]>nums[1]?nums[0]:nums[1];
//״̬ת�ƺ�����ȡ(rst[i-2]+nums[i])��rst[i-1]�нϴ�ģ���rst[i] = (rst[i-2]+nums[i])>rst[i-1]?(rst[i-2]+nums[i]):rst[i-1];
//ע�⣺����nums����Ϊ0��1���������
public class Solution {
	public int rob(int[] nums) {
		int[] rst = new int[nums.length];
		if(nums.length>0){
			rst[0] = nums[0];
			if(nums.length>1){
				rst[1] = nums[0]>nums[1]?nums[0]:nums[1];
				int i=2;
				for(i=2;i<nums.length;i++){
					rst[i] = (rst[i-2]+nums[i])>rst[i-1]?(rst[i-2]+nums[i]):rst[i-1];	//״̬ת�ƺ���
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
