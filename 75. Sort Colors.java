import java.util.ArrayList;
import java.util.List;

//���⣺��0��1��2��ɵ��������飬��������

//�������飬���ֱ���red��white��blue����list��0��1��2������������list������ֵ������
public class Solution {
    public void sortColors(int[] nums) {
        List<Integer> red = new ArrayList<Integer>();
        List<Integer> white = new ArrayList<Integer>();
        List<Integer> blue = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                red.add(0);
            if(nums[i]==1)
                white.add(1);
            if(nums[i]==2)
                blue.add(2);
        }
        int i,j,k;
        for(i=0;i<red.size();i++)
            nums[i] = 0;
        for(j=0;j<white.size();j++)
            nums[i+j] = 1;
        for(k=0;k<blue.size();k++)
            nums[i+j+k] = 2;
    }
}