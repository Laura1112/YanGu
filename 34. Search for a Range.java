//题意：给定一个包含 n 个整数的排序数组，找出给定目标值 target 的起始和结束位置。如果目标值不在数组中，则返回[-1, -1]

//用二分查找法找到一个target所在位置，然后再分别向左向右遍历，直到找到边界
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] rst = {-1,-1};
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<target)    low = mid+1;
            else if(nums[mid]>target)   high = mid-1;
            else{
                int left=mid-1;
                int right=mid+1;
                while(left>-1&&nums[left]==nums[mid])
                    left--;
                rst[0] = left+1;
                while(right<nums.length&&nums[right]==nums[mid])
                    right++;
                rst[1] = right-1;
                break;
            }
        }
        return rst;
    }
}