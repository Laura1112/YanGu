//题意：给定一个正序带重复的数组，在不使用原数组的情况下，删除其中出现超过两次的元素，并返回新数组长度

//特殊情况：当数组长度小于2时，则数组不变，返回数组长度即可
//从第三个元素开始遍历数组，并与更新过的数组的第j-2个数进行比较，若相同不做操作，否则赋值给nums[j++]
public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len<2) return len;
        int j=2;
        for(int i=2;i<len;i++){
            if(nums[i]>nums[j-2])   //注意要跟已跟新的比，即nums[j-2]而不是nums[i-2]
                nums[j++]=nums[i];
        }
        return j;
    }
}
