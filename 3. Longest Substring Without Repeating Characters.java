import java.util.HashMap;
import java.util.Map;

//题意：给定一个字符串，求没有重复字符的最长子串长度

//两点法：左指针j指向不重复子串开始，右指针i指向结尾，则当前无重复字符的子串长度为i-j+1
//遍历的同时，用hashmap存储每个字符，key为字符，value为位置
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int j = 0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
//有多个相同的character时，get到的是最后一个
                j = Math.max(j,map.get(s.charAt(i))+1);		//确定左指针，即如果重复的出现在当前左指针之前，则不移动j，否则后移
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);				//求最长的无重复子串长度
        }
        return max;
    }
}