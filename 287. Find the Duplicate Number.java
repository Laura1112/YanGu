import java.util.ArrayList;
import java.util.List;
//题意：Given an array nums containing n + 1 integers where 
//each integer is between 1 and n (inclusive), prove that 
//at least one duplicate number must exist. Assume that there is 
//only one duplicate number, find the duplicate one.

//遍历数组，用list存储，并判断之前是否出现过
public class Solution {
    public int findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))
                return nums[i];
            else
                list.add(nums[i]);
        }
        return -1;
    }
}