import java.util.Arrays;

//题意：把给定数组的每个数都变成一样大，每次只能选择一个元素+1或-1，求最少需要多少步
//将给定数组排序，将每个元素与中间的那个数相减求绝对值，rst += Math.abs(about_mid-nums[i]);rst即为结果
public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);		//数组排序
        int len = nums.length;
        int about_mid = nums[len/2];
        int rst = 0;
        for(int i=0;i<len;i++){
            rst += Math.abs(about_mid-nums[i]);  //与中间的数比较
        }
        return rst;
    }
}