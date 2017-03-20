import java.util.Arrays;

//题意：找出一个数组中的最小值，该数组是由正序的数组经几次中心轮转之后形成的，如[5，6,7,0，1,2,3,4]

//排序再返回第一个数
public class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}