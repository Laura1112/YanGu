import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//题意：给定一个字符串，按字符出现次数从多到少排序
/*
Input:
"tree"
Output:
"eert"*/

//法一（AC）：用HashMap统计，再用list装载map实现排序，最终导出结果
//法二（AC）：用map存储字符及出现次数，定义一个list数组，list[i]表示出现i次的字符们，最终从后往前遍历list得到结果
public class Solution {
    public String frequencySort(String s) {
    	/*法一（AC）：用HashMap统计，再用list装载map实现排序，最终导出结果*/
        //不用String rst，会超时,因为rst +=...的效率不如StringBuilder rst中的rst.append(...)，
        StringBuilder rst = new StringBuilder();
        //统计字符出现次数
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        //按出现次数从多到少排序    
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2){
                return o2.getValue()-o1.getValue();
            }
        });
        //获取list中内容，连成最终结果
        for(int i=0;i<list.size();i++){
            char cur = list.get(i).getKey();
            int count = list.get(i).getValue();
            for(int j=0;j<count;j++){
                rst.append(cur);
            }
        }
        return rst.toString();
    
        /*法二（AC）：用map存储字符及出现次数，定义一个list数组，list[i]表示出现i次的字符们，最终从后往前遍历list得到结果
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        List<Character>[] list = new List[ch.length+1];     //定义list数组
        int idx;
        for(char key:map.keySet()){
            idx = map.get(key);
            if(list[idx]==null)
                list[idx] = new ArrayList<>();
            list[idx].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=ch.length;i>0;i--){
            if(list[i]!=null){
                for(int j=0;j<list[i].size();j++){
                    for(int k=0;k<i;k++)
                        sb.append(list[i].get(j));
                }
                    
            }
        }
        return sb.toString();*/
    }
}