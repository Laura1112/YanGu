//���⣺����һ�����������Ŀ��ֵ���������д��ڸ�ֵ���򷵻�λ�ã��������ڣ�ָ��Ӧ�����ĸ�λ��

//Ϊ�˷�ֹ����Խ�磬�ȶ�Ŀ��ֵ�����������������������
//Ȼ����whileѭ����������б�����ֱ��target<=nums[i],���ҵ�λ�ã����ڱ�ʾ���ڣ�<��ʾ�����ڣ�
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1])
            return nums.length;
        int i=0;
        while(target>nums[i])
            i++;
        return i;
    }
}