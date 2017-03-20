//题意：给定一个正序数组和目标值，若数组中存在该值，则返回位置，若不存在，指明应该在哪个位置

//为了防止数组越界，先对目标值大于所有数的情况单独处理
//然后用while循环对数组进行遍历，直到target<=nums[i],即找到位置（等于表示存在，<表示不存在）
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1])
            return nums.length;
        int i=0;
        while(target>nums[i])
            i++;
        return i;
    }
}