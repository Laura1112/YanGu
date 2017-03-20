//题意：求和最大的子集，返回最大的和

//分治算法：把数组分成左右两等份，进行递归，分别求左右两边的最大值，直到left==right；再算跨中心的情况，最后比较三种情况的最大值，即为结果
public class Solution {
    public int maxSubArray(int[] nums) {
        return divide(nums,0,nums.length-1);
    }
    //分治！！！
    public int divide(int[] a,int left,int right){
//递归的终点
        if(left==right){
            return a[left];
        }
        //递归：左、右情况
        int mid = (left+right)/2;
        int leftMax = divide(a,left,mid);
        int rightMax = divide(a,mid+1,right);
        //跨中心情况
        int left_center = 0;
        int left_center_max = a[mid];
        for(int i=mid;i>=left;i--){
            left_center += a[i];
            if(left_center>left_center_max)
                left_center_max = left_center;
        }
        int right_center = 0;
        int right_center_max = a[mid+1];
        for(int i=mid+1;i<=right;i++){
            right_center += a[i];
            if(right_center>right_center_max)
                right_center_max = right_center;
        }
        //比较三种情况，求最大值
        return Math.max(left_center_max+right_center_max,Math.max(leftMax,rightMax));
    }
}
