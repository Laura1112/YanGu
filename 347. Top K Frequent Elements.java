import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//题意：求出现频率最高的k个数

//用hashMap存储数组元素及出现次数，再将该map放入list中，按value值（次数）从高到低排序
//取排名前k个key值
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> rst = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums)
            map.put(n,map.getOrDefault(n,0)+1);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
                return (o2.getValue()-o1.getValue());
            }
        });
        int count = 0;
        for(Map.Entry<Integer,Integer> m:list){		//!!!!类型是Map.Entry<Integer,Integer> 
            if(count<k){
                rst.add(m.getKey());
                count++;
            }
            else
                break;
        }
        return rst;
    }
}
