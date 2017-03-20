import java.util.Arrays;

//����һ�����У���ʹ�ö���ռ�
/*
1,2,3 �� 1,3,2
3,2,1 �� 1,2,3
1,1,5 �� 1,5,1
*/

//��1���Ӻ���ǰ���ҵ���һ��ʹ��nums[i]>nums[i-1]��λ��i
//��2���Ƚ�nums[i-1]��λ��i�Ժ�������ҵ���nums[i-1]����������������������λ��
//��3����λ��i�Ժ��������ʹ���������
public class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        //��1��
        while(i>0&&nums[i]<=nums[i-1])
            i--;
        //���ж�������ģ���ص���������
        if(i==0){
             Arrays.sort(nums);
             return;
        }
        //��2��
        int n = nums[i-1];
        int j=nums.length-1;
        while(nums[j]<=n)
            j--;
        nums[i-1] = nums[j];
        nums[j] = n;
        //��3��
        int count = 0;
        for(int k=i;k<i+(nums.length-i)/2;k++){
            count++;
            int tmpt = nums[k];
            nums[k] = nums[nums.length-count];
            nums[nums.length-count] = tmpt;
        }
    }
}
