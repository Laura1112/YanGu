import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//题意：判断给定字符串是否是一个子字符串重复形成的，如abcabcabc,即由abc重复形成
//先求给定字符串长度的所有因数，并将因数放入list中，再将list排序
//从大到小取出list中的数，每个数代表可能的子串长度，将str按照同样长度截成多份，比较每份是否相同，若每份都相同则返回true；
//若遍历完list，都没找到一个子串，使得每份都相同，则返回false
//str长度为1，以及单个字符重复的，如bbbbb，需要单独考虑！！
public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int length = str.length();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for(int i=2;i<=Math.sqrt(length);i++){
            if(length%i==0){
                list.add(i);
                list.add(length/i);
            }
        }
        Collections.sort(list);
        String subString = "";
        int count = 0;
        int sublength;
        for(int i=list.size()-1;i>=0;i--){
            sublength = list.get(i);
            subString = str.substring(0,sublength);
            count = length/sublength;
            if(count==1)
                return false;
            int j;
            for(j=1;j<count;j++){
                if(!str.substring(sublength*j,sublength*(j+1)).equals(subString)){
                    break;
                }
                else
                    continue;
            }
            if(j==count)
                return true;
        }
        return false;
    }
}