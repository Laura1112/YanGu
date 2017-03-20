import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//题意：给一个数组，求其中三个数和为0的组合

//两点法：先排序
//三个数中，第一个数从第一个开始向后遍历，若与前一个相同则跳过；第二个数从第一个数的后一个开始向后遍历；第三个数从最后一个数开始向前遍历，遍历时遇到与之前相同的，则继续遍历
public class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> rst = new ArrayList<List<Integer>>();
      int len = nums.length;
      if(len<3)   
          return rst;
      Arrays.sort(nums);
      int sum = 0;
      int j=0,k=0;
      for(int i=0;i<len-2;i++){
          if(i==0||(i>0&&nums[i]!=nums[i-1])){
              j = i+1;
              k = len-1;
              while(j<k){
                  sum = nums[i]+nums[j]+nums[k];
                  if(sum==0){
                      rst.add(Arrays.asList(nums[i],nums[j],nums[k]));
                      while(j<k&&nums[j+1]==nums[j])  j++;
                      while(j<k&&nums[k-1]==nums[k])  k--;
                      j++;
                      k--;
                  }
                  else if(sum>0){
                      while(j<k&&nums[k-1]==nums[k])  k--;
                      k--;
                  }
                  else{
                       while(j<k&&nums[j+1]==nums[j])  j++;
                       j++;
                  }                   
              }
          }
      }
      return rst;
  }
}