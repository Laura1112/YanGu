//题意：求一个数组中的长度最小的子串，满足和大于等于s

//遍历数组，从头开始累加，直到大于等于s，比较该子串长度与之前的最小值，并循环减去子串前面的数，求出最短值
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if(len==0)
            return 0;
        int i=0,j=0,sum=0,rst=Integer.MAX_VALUE;
        while(j<len){
            sum+=nums[j];
            j++;
            while(sum>=s){
                rst = Math.min(rst,j-i);
                sum-=nums[i];
                i++;
            }
        }
        return rst==Integer.MAX_VALUE?0:rst;
    }
}