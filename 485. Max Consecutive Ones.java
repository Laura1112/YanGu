//���⣺һ��������0��1��ɣ�������ж��ٸ�������1

//��ͷ��β��������ͳ��1�ĸ���
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int rst=0;
        int count = 0;
        for(int i:nums){
            if(i==1)    count++;
            else{
                if(count>rst)
                    rst = count;
                count=0;
            }
        }
        if(count>rst)
            rst = count;
        return rst;
    }
}