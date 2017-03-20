import java.util.Arrays;

//题意：将给定数组变成所有值都一样，每一步只能将n-1个数加1，求最少需要几步
//将给定数组排序Arrays.sort(nums);
//从前至后遍历数组，rst += (nums[i+1]-nums[i])*(length-i-1);
public class Solution {
    public static int minMoves(int[] nums) {
        Arrays.sort(nums);
        int rst = 0;
        int length = nums.length;
        for(int i=0;i<nums.length-1;i++){
        	rst += (nums[i+1]-nums[i])*(length-i-1);
        }
        return rst;
    }
    
    public static void main(String[] args){
    	int[] nums = {1,3,7,4};
    	System.out.println(minMoves(nums));
    }
}