import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//���⣺���ַ�����s���ҳ����ַ���p�����ͬ�������ͬ��˳����Բ�ͬ�����Ӵ���������λ��
//��hashmap�洢p���ַ��ͳ��ִ�����
//����s��������smap�����������p�ĳ��ȣ����i-plλ�õ��ַ����д�������Ӧ��value=1����ֱ��ɾ����remove�������򣬶�Ӧ��value-1
//�Ƚϵ�ǰ��smap�Ƿ���pmap��ͬ����ͬ��i-pl+1����list����󷵻�list
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