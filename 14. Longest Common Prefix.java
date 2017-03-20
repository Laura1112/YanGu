/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * @author Laura
 *
 */
//题意：找最大前缀
//用数组ch[]存储第一个字符串数组的每个字符，并依次比较每个字符是否在其他字符串相同位置出现
//注意：如果后面的字符串较短，没得比较了，及时停止；若参数给出的数组为空，单独处理
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
