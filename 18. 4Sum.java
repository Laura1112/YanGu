import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//���⣺����һ�����飬���ĸ����ĺ͵���target�����

//������
//���㷨���ĸ���ֱ�1��i����0��len��3��������2��j����i+1��len��2��������3��k����j+1��ʼ��������4��l����len��1��ʼ����������k<l  
//������֮ǰ��ͬ�Ķ��ٱ���һ��
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