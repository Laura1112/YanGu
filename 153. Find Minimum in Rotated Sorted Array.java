import java.util.Arrays;

//���⣺�ҳ�һ�������е���Сֵ��������������������龭����������ת֮���γɵģ���[5��6,7,0��1,2,3,4]

//�����ٷ��ص�һ����
public class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}