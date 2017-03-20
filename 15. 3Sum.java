import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//���⣺��һ�����飬��������������Ϊ0�����

//���㷨��������
//�������У���һ�����ӵ�һ����ʼ������������ǰһ����ͬ���������ڶ������ӵ�һ�����ĺ�һ����ʼ���������������������һ������ʼ��ǰ����������ʱ������֮ǰ��ͬ�ģ����������
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