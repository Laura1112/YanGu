import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//��������������������֣��ظ��Ĳ�ռ
//�������������TreeSet�У�ȥ��+���򣩣��ٽ�set����list�У�����ʹ��get������
//��list����С��3����ȡ���һ����������ȡ������������
public class Solution {
    public int thirdMax(int[] nums) {
    	//TreeSet����ȥ�ظ�����ʵ���Զ����򣬵���û��get������������ת��list
    	Set<Integer> set =  new TreeSet<Integer>();
        for(int i:nums)
            set.add(i);
        List<Integer> list = new ArrayList<Integer>(set);
        if(list.size()<3)
            return list.get(list.size()-1);
        else
            return list.get(set.size()-4);
    }
}