import java.util.ArrayList;
import java.util.List;

//���⣺��ӵ�һ�����ܷ��������ÿ�����������������Զ����

//����һ��list����ʾ���Ե���ĵ��λ�ã��Ӻ���ǰ������
//ֻҪ��ǰֵ>=�ɵ��������Ч��ľ��룬��õ�λ�þͿ��Ա�����list�У������ж�0�Ƿ񱻼��룬�����ж��Ƿ���Դӿ�ʼ�������
public class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        list.add(len-1);
        for(int i=len-2;i>=0;i--){
            int dis = list.get(list.size()-1)-i;
            if(nums[i]>=dis)
                list.add(i);
        }
        if(list.contains(0))
            return true;
        else
            return false;
    }
}