/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * @author Laura
 *
 */
//���⣺�����ǰ׺
//������ch[]�洢��һ���ַ��������ÿ���ַ��������αȽ�ÿ���ַ��Ƿ��������ַ�����ͬλ�ó���
//ע�⣺���������ַ����϶̣�û�ñȽ��ˣ���ʱֹͣ������������������Ϊ�գ���������
public class Solution {
	public static String longestCommonPrefix(String[] strs) {       
        String rst = "";
        if(strs.length!=0){
        boolean tag = true;
        char[] ch = new char[strs[0].length()];
        int j;        
        for(j=0;j<strs[0].length();j++){
        	ch[j] = strs[0].charAt(j); 
        	for(int i=1;i<strs.length;i++){
        		if(j>=strs[i].length()||strs[i].charAt(j)!=ch[j]){
        			tag = false;
        			break;
        		}
        	}
        	if(tag==false)
        		break;
        }
        rst = strs[0].substring(0, j);           
        }	
        return rst;
    }
	
	public static void main(String[] arg){
		String[] s = {"ssdv","s","s"};
		System.out.println(longestCommonPrefix(s));
	}

}
