//题意：求数组中所有数字的乘积，除了自身（不能使用除法）
//计算每个数字前面所有数的乘积，再乘后面所有数的乘积
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] rst = new int[len];
        rst[0] = 1;
 //计算前面所有数乘积
        for(int i=1;i<len;i++){
            rst[i]=rst[i-1]*nums[i-1];
        }
//再乘上后面所有数乘积
        int right = 1;
        for(int i=len-1;i>=0;i--){
            rst[i] *= right;
            right *= nums[i];
        }
        return rst;
    }
}