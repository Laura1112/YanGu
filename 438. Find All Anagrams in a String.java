import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//题意：从字符串中s中找出与字符串p组成相同（组成相同，顺序可以不同）的子串，并返回位置
//用hashmap存储p的字符和出现次数；
//遍历s，并存入smap，当坐标大于p的长度，则对i-pl位置的字符进行处理，若对应的value=1，则直接删除（remove），否则，对应的value-1
//比较当前的smap是否与pmap相同，相同则将i-pl+1加入list，最后返回list
public class Solution{
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        int sl = s.length();
        int pl = p.length();
        Map<Character,Integer> pmap = new HashMap<Character,Integer>();
        Map<Character,Integer> smap = new HashMap<Character,Integer>();  
        for(int i=0;i<pl;i++){
            char pc = p.charAt(i);
            if(pmap.containsKey(pc))
                pmap.put(pc,pmap.get(pc)+1);
            else
                pmap.put(pc,1);
        }     
        char sc = ' ';
        char old = ' ';
       for(int i=0;i<sl;i++){
    	   sc = s.charAt(i);    	 
    	   if(smap.containsKey(sc)){  
               smap.put(sc,smap.get(sc)+1);
    	   }
           else{        
               smap.put(sc,1);
           }
    	   if(i>=pl){   
    		   old = s.charAt(i-pl);    		   
    		   if(smap.get(old)==1)
    			   smap.remove(old);
    		   else
    			   smap.put(old, smap.get(old)-1);		   
    	   }
    	   if(pmap.equals(smap))
    		   list.add(i-pl+1);           
        }
        return list;    
    }

    public static void main(String[] args){
    	String s = "cbaebabacd";
    	String p = "abc";
    	Solution t = new Solution();
    	List<Integer> rst = t.findAnagrams(s, p);
    	for(int i=0;i<rst.size();i++){
    		System.out.println(rst.get(i));
    	}
    }
}