import java.util.Arrays;

//���⣺������0,1,2,3...�ݵ����飬������ȱ��ĳ�������ҳ�ȱ�ٵ���

//�����������α�������nums[i]!=iʱ�����ҵ������Ϊi
//�����������û�ҵ�i���򷵻�i+1����len
public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]!=i)
                return i;
        }
        return len;
    }
}
