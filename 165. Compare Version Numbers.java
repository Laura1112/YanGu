import java.util.ArrayList;
import java.util.List;

/**
 * Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
Here is an example of version numbers ordering:
0.1 < 1.1 < 1.2 < 13.37
 * @author laura1112
 *
 */
public class Solution {
	public static int compareVersion(String version1, String version2) {
		String s1="";
		String s2="";
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i=0;i<version1.length();i++){
			if(version1.charAt(i)!='.')
				s1 = s1+version1.charAt(i);
			else{
				list1.add(Integer.valueOf(s1));
				s1 = "";
			}
		}
		if(s1!="")
			list1.add(Integer.valueOf(s1));
		for(int i=0;i<version2.length();i++){
			if(version2.charAt(i)!='.')
				s2 = s2+version2.charAt(i);
			else{
				list2.add(Integer.valueOf(s2));
				s2 = "";
			}
		}
		if(s2!="")
			list2.add(Integer.valueOf(s2));
		int size = list1.size()<list2.size()?list1.size():list2.size();
		for(int i=0;i<size;i++){
			if(list1.get(i)>list2.get(i))
				return 1;
			else if(list1.get(i)<list2.get(i))
				return -1;
			else 
				continue;
		}
		//同等长度的比较完后，再比较谁还有剩余，则谁大，如1.1和1.1.2
		if(list1.size()>list2.size()){
			for(int i=size;i<list1.size();i++){
				if(list1.get(i)>0)
					return 1;
			}
		}
		else if(list1.size()<list2.size()){
			for(int i=size;i<list2.size();i++){
				if(list2.get(i)>0)
					return -1;
			}
		}
		return 0;   
    }
	
	public static void main(String[] arg){
		String v1 = "2.2";
		String v2 = "2.2.0.1";
		System.out.println(compareVersion(v1,v2));
	}
}
