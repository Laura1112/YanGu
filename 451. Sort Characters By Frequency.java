import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//���⣺����һ���ַ��������ַ����ִ����Ӷൽ������
/*
Input:
"tree"
Output:
"eert"*/

//��һ��AC������HashMapͳ�ƣ�����listװ��mapʵ���������յ������
//������AC������map�洢�ַ������ִ���������һ��list���飬list[i]��ʾ����i�ε��ַ��ǣ����մӺ���ǰ����list�õ����
public class Solution {
    public String frequencySort(String s) {
    	/*��һ��AC������HashMapͳ�ƣ�����listװ��mapʵ���������յ������*/
        //����String rst���ᳬʱ,��Ϊrst +=...��Ч�ʲ���StringBuilder rst�е�rst.append(...)��
        StringBuilder rst = new StringBuilder();
        //ͳ���ַ����ִ���
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        //�����ִ����Ӷൽ������    
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2){
                return o2.getValue()-o1.getValue();
            }
        });
        //��ȡlist�����ݣ��������ս��
        for(int i=0;i<list.size();i++){
            char cur = list.get(i).getKey();
            int count = list.get(i).getValue();
            for(int j=0;j<count;j++){
                rst.append(cur);
            }
        }
        return rst.toString();
    
        /*������AC������map�洢�ַ������ִ���������һ��list���飬list[i]��ʾ����i�ε��ַ��ǣ����մӺ���ǰ����list�õ����
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        List<Character>[] list = new List[ch.length+1];     //����list����
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