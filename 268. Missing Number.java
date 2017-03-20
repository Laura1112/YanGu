import java.util.Arrays;

//题意：给定［0,1,2,3...］的数组，乱序且缺少某个数，找出缺少的数

//先排序，再依次遍历，当nums[i]!=i时，即找到结果，为i
//若遍历到最后都没找到i，则返回i+1，即len
public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]!=i)
                return i;
        }
        return len;
    }
}
