import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//���⣺�������г��ֳ���3/n�ε���
//�������飬��HashMap�洢ÿ��Ԫ�غͳ��ֵĴ���
//������map��key����value����3/n�ͼ�����
public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        int target = len/3;
        List<Integer> rst = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        Iterator keys = map.keySet().iterator();
        while(keys.hasNext()){
            Object key = keys.next();
            if(map.get((int)key)>target)
                rst.add((int)key);   
        }
        return rst;
    }
}