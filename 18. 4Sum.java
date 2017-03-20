import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//题意：给定一个数组，求四个数的和等于target的组合

//先排序
//两点法：四个点分别（1）i：从0至len－3遍历；（2）j：从i+1至len－2遍历；（3）k：从j+1开始遍历；（4）l：从len－1开始遍历；其中k<l  
//遇到与之前相同的都再遍历一个
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> rst = new ArrayList<>();
        int len = nums.length;
        if(len<4)
            return rst;
        int sum = 0;
        int k=0,l=0;
        Arrays.sort(nums);
        for(int i=0;i<len-3;i++){
            if(i==0||(i<len-3&&nums[i]!=nums[i-1])){
                for(int j=i+1;j<len-2;j++){
                    if(j==i+1||(j<len-2&&nums[j]!=nums[j-1])){
                        k=j+1;
                        l=len-1;
                        while(k<l){
                            sum = nums[i]+nums[j]+nums[k]+nums[l];
                            if(sum==target){
                                rst.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                            while(k<l&&nums[k+1]==nums[k])   k++;
                            while(k<l&&nums[l-1]==nums[l])   l--;
                            k++;
                            l--;
                            }
                            else if(sum>target){
                                while(k<l&&nums[l-1]==nums[l])   l--;
                                l--;
                            }
                            else{
                                while(k<l&&nums[k+1]==nums[k])   k++;
                                k++;
                            }
                        }
                    }
                }
            }
        }
        return rst;
    }
}