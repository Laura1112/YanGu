import java.util.Arrays;

//题意：求一个数组中最接近target值的三个数之和

//先排序
//用nums[i] nums[j] nums[k]表示当前计算的三个数，i从0到len-1遍历，j=i+1,k=len-1,根据计算结果决定是否要返回当前和，以及指针j后移还是k前移
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int rst = 0;
        int sum = 0;
        int len = nums.length;
        if(len<=3){
            for(int n:nums)
                rst += n;
        }
        
        Arrays.sort(nums);
        rst = nums[0]+nums[1]+nums[2];
        if(rst==target)  return rst;
        for(int i=0;i<len-2;i++){
            int j = i+1;
            int k = len-1;
            while(j<k){
                sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(target-rst)>Math.abs(target-sum)){
                    rst = sum;
                    if(rst==target)  return rst;
                }
                if(sum>target)
                    k--;
                else
                    j++;
            }
        }
        return rst;
    }
}