import java.util.Arrays;


//题意：一个正序数组，经过轮询转换后，如[1,4,6,7,1,2,3],在该数组中找是否存在target

//先排序，再二分查找（二分查找的low和high对应的是下标！！！！手写一遍二分查找）
public class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>target)
                high = mid-1;
            else if(nums[mid]<target)
                low = mid+1;
            else
                return true;
        }
        return false;
    }
}