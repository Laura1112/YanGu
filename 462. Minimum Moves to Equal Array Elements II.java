import java.util.Arrays;

//���⣺�Ѹ��������ÿ���������һ����ÿ��ֻ��ѡ��һ��Ԫ��+1��-1����������Ҫ���ٲ�
//�������������򣬽�ÿ��Ԫ�����м���Ǹ�����������ֵ��rst += Math.abs(about_mid-nums[i]);rst��Ϊ���
public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);		//��������
        int len = nums.length;
        int about_mid = nums[len/2];
        int rst = 0;
        for(int i=0;i<len;i++){
            rst += Math.abs(about_mid-nums[i]);  //���м�����Ƚ�
        }
        return rst;
    }
}