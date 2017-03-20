/*题意：求柱状图的储水量
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it is able to trap after raining.
For example,
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
*/

//正序遍历数组，求当前值左边的最大值left[i]
//逆序遍历数组，求当前值右边的最大值right[i]（最大值都记录下来）
//再遍历数组left[i]和right[i]，取较小值与height[i]比较
public class Solution {
    public int trap(int[] height) {
        int rst = 0;
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int leftMax = 0;
        int rightMax = 0;
        //求当前值左边最大的
        for(int i=1;i<len;i++){
            if(height[i-1]>leftMax){
                leftMax = height[i-1];
            }

            left[i]=leftMax;
        }
        //求当前值右边最大的
        for(int i=len-2;i>=0;i--){
            if(height[i+1]>rightMax){
                rightMax = height[i+1];
            }
                right[i]=rightMax;
        }
        //取当前值的左右最大中相对小的值，与当前值比较，并统计
        for(int i=0;i<len;i++){
            int minor = Math.min(left[i],right[i]);
            if(height[i]<minor)
                rst += minor-height[i];
        }
        return rst;
    }
}
