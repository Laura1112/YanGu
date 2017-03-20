//题意：数一个字符串里有多少个片段，以空格为分割
//若当前字符串不为空，且前一个字符串为空，则加1
public class Solution {
    public int countSegments(String s) {
        int rst = 0;
        char ex = ' ';
        char now = ' ';
        for(int i=0;i<s.length();i++){
            now = s.charAt(i);
            if(now!=' '&&ex==' ')
                rst++;
            ex = now;
        }
        return rst;
    }
}