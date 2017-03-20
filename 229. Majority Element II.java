import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//题意：求数组中出现超过3/n次的数
//遍历数组，用HashMap存储每个元素和出现的次数
//最后遍历map的key，若value大于3/n就加入结果
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