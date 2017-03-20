//题意：一个数组由0，1组成，求最多有多少个连续的1

//从头至尾遍历，并统计1的个数
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int rst=0;
        int count = 0;
        for(int i:nums){
            if(i==1)    count++;
            else{
                if(count>rst)
                    rst = count;
                count=0;
            }
        }
        if(count>rst)
            rst = count;
        return rst;
    }
}