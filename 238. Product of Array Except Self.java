//���⣺���������������ֵĳ˻���������������ʹ�ó�����
//����ÿ������ǰ���������ĳ˻����ٳ˺����������ĳ˻�
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] rst = new int[len];
        rst[0] = 1;
 //����ǰ���������˻�
        for(int i=1;i<len;i++){
            rst[i]=rst[i-1]*nums[i-1];
        }
//�ٳ��Ϻ����������˻�
        int right = 1;
        for(int i=len-1;i>=0;i--){
            rst[i] *= right;
            right *= nums[i];
        }
        return rst;
    }
}