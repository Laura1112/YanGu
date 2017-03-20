//���⣺��һ�������еĳ�����С���Ӵ�������ʹ��ڵ���s

//�������飬��ͷ��ʼ�ۼӣ�ֱ�����ڵ���s���Ƚϸ��Ӵ�������֮ǰ����Сֵ����ѭ����ȥ�Ӵ�ǰ�������������ֵ
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if(len==0)
            return 0;
        int i=0,j=0,sum=0,rst=Integer.MAX_VALUE;
        while(j<len){
            sum+=nums[j];
            j++;
            while(sum>=s){
                rst = Math.min(rst,j-i);
                sum-=nums[i];
                i++;
            }
        }
        return rst==Integer.MAX_VALUE?0:rst;
    }
}