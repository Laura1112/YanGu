//���⣺��һ����������ֵ

//���������ֵ
public class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int rst = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                rst = i;
            }
        }
        return rst;
    }
}