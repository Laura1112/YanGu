//���⣺����һ��������ظ������飬�ڲ�ʹ��ԭ���������£�ɾ�����г��ֳ������ε�Ԫ�أ������������鳤��

//��������������鳤��С��2ʱ�������鲻�䣬�������鳤�ȼ���
//�ӵ�����Ԫ�ؿ�ʼ�������飬������¹�������ĵ�j-2�������бȽϣ�����ͬ��������������ֵ��nums[j++]
public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len<2) return len;
        int j=2;
        for(int i=2;i<len;i++){
            if(nums[i]>nums[j-2])   //ע��Ҫ���Ѹ��µıȣ���nums[j-2]������nums[i-2]
                nums[j++]=nums[i];
        }
        return j;
    }
}
