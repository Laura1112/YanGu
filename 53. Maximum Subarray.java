//���⣺��������Ӽ����������ĺ�

//�����㷨��������ֳ��������ȷݣ����еݹ飬�ֱ����������ߵ����ֵ��ֱ��left==right����������ĵ���������Ƚ�������������ֵ����Ϊ���
public class Solution {
    public int maxSubArray(int[] nums) {
        return divide(nums,0,nums.length-1);
    }
    //���Σ�����
    public int divide(int[] a,int left,int right){
//�ݹ���յ�
        if(left==right){
            return a[left];
        }
        //�ݹ飺�������
        int mid = (left+right)/2;
        int leftMax = divide(a,left,mid);
        int rightMax = divide(a,mid+1,right);
        //���������
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
        //�Ƚ���������������ֵ
        return Math.max(left_center_max+right_center_max,Math.max(leftMax,rightMax));
    }
}
