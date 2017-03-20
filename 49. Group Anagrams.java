import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//题意：把组成字符相同的字符串归类
/*For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]*/

//遍历String[] strs，并将每个字符串的每个字符加入list中，再排序，再将排完序的list放入map中，并用list记住在数组中的位置
//遍历map的value，并按key和value值，将归类后的结果放入List<List<String>> rst中
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rst = new ArrayList<>();
		List<Character> list = new ArrayList<>();
		List<Integer> idxList = new ArrayList<>();
		Map<List<Character>,List<Integer>> map = new HashMap<>();
		for(int i=0;i<strs.length;i++){
			list = new ArrayList<>();
			for(int j=0;j<strs[i].length();j++){
				list.add(strs[i].charAt(j));
			}
			Collections.sort(list);
			idxList = map.getOrDefault(list, new ArrayList<Integer>());
			idxList.add(i);
			map.put(list,idxList);
		}
		Iterator<List<Integer>> values = map.values().iterator();
		int i=0;
		while(values.hasNext()){
			List<Integer> value = new ArrayList<>();
			value = values.next();
			List<String> strList = new ArrayList<>();
			for(int k:value){
				strList.add(strs[k]);
			}		
			rst.add(strList);
		}
       return rst; 
    }
}