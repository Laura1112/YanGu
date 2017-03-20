//题意：找一个数组的最大值

//遍历找最大值
public class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int rst = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                rst = i;
            }
        }
        return rst;
    }
}