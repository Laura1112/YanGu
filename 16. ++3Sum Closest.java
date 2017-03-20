import java.util.Arrays;

//���⣺��һ����������ӽ�targetֵ��������֮��

//������
//��nums[i] nums[j] nums[k]��ʾ��ǰ�������������i��0��len-1������j=i+1,k=len-1,���ݼ����������Ƿ�Ҫ���ص�ǰ�ͣ��Լ�ָ��j���ƻ���kǰ��
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int rst = 0;
        int sum = 0;
        int len = nums.length;
        if(len<=3){
            for(int n:nums)
                rst += n;
        }
        
        Arrays.sort(nums);
        rst = nums[0]+nums[1]+nums[2];
        if(rst==target)  return rst;
        for(int i=0;i<len-2;i++){
            int j = i+1;
            int k = len-1;
            while(j<k){
                sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(target-rst)>Math.abs(target-sum)){
                    rst = sum;
                    if(rst==target)  return rst;
                }
                if(sum>target)
                    k--;
                else
                    j++;
            }
        }
        return rst;
    }
}