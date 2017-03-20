//题意：检测一个单词是否规范。有如下三种是规范的
/*
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".*/

//把给定字符串转换成数组，然后遍历数组，定义一个tag，初始为1，遇到大写时，tag++，遇到小写时tag=0
//若大写前已有小写，返回false；若小写前有多于一个大写，返回false；若既不是大写也不是小写，返回false
public class Solution {
    public boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();
        int tag = 1;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A'&&ch[i]<='Z'){
                //一旦有小写后，不能有大写
                if(tag==0)
                    return false;
                tag++;
            }
            else if(ch[i]>='a'&&ch[i]<='z'){
                //小写前的大写不能超过一个
                if(tag>2)
                    return false;
                tag = 0;
            }
            else
                return false;
        }
        return true;
    }
}
