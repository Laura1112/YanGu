//题意：给定一个数组和一个目标值target，在这个数组中选数（可重复），使其和为target,求共有多少种组合
/*
nums = [1, 2, 3]
target = 4

The possible combination ways are:
(1, 1, 1, 1)
(1, 1, 2)
(1, 2, 1)
(1, 3)
(2, 1, 1)
(2, 2)
(3, 1)

Therefore the output is 7.*/

//动态规划：rst[i] += rst[i-nums[j]];
public class Solution {
    public int combinationSum4(int[] nums, int target) {        
        //dynamic programming：rst[i] += rst[i-nums[j]];
        int[] rst = new int[target+1];
        rst[0] = 1;
        for(int i=1;i<=target;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]<=i)
                    rst[i] += rst[i-nums[j]];
            }
        }
        return rst[target];     
     
      //递归法（会超时）
        /*int rst = 0;
        if(target==0)
            return 1;
        for(int i=0;i<nums.length;i++){
            if(target>=nums[i])
                rst += combinationSum4(nums,target-nums[i]);
        }
        return rst;*/
        
    }
}