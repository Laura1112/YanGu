//题意：求给定数组中乘积最大的子数组

//遍历数组，计算出遍历到当前数字的乘积最大和最小值，即比较tmpt_max*nums[i] 和tmpt_min*nums[i])和nums[i]
public class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if(len==0)  return 0;
        
        int max = nums[0];
        int min = nums[0];
        int tmpt_max = max;
        int tmpt_min = min;
        int rst = nums[0];
        for(int i=1;i<len;i++){
             max = Math.max(Math.max(tmpt_max*nums[i],tmpt_min*nums[i]),nums[i]);
             min = Math.min(Math.min(tmpt_max*nums[i],tmpt_min*nums[i]),nums[i]);
             rst = Math.max(rst,max);
             tmpt_max = max;
             tmpt_min = min;
        }
        return rst;
    }
}
