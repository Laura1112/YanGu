import java.util.Arrays;

//求下一个序列，不使用额外空间
/*
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
*/

//（1）从后向前，找到第一个使得nums[i]>nums[i-1]的位置i
//（2）比较nums[i-1]和位置i以后的数，找到比nums[i-1]大的且最相近的数，并调换位置
//（3）对位置i以后的数逆序，使其变成正序的
public class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        //（1）
        while(i>0&&nums[i]<=nums[i-1])
            i--;
        //所有都是逆序的，则回到所有正序
        if(i==0){
             Arrays.sort(nums);
             return;
        }
        //（2）
        int n = nums[i-1];
        int j=nums.length-1;
        while(nums[j]<=n)
            j--;
        nums[i-1] = nums[j];
        nums[j] = n;
        //（3）
        int count = 0;
        for(int k=i;k<i+(nums.length-i)/2;k++){
            count++;
            int tmpt = nums[k];
            nums[k] = nums[nums.length-count];
            nums[nums.length-count] = tmpt;
        }
    }
}
