//题意：给一串数字字符，解码可能性
/*
'A' -> 1
'B' -> 2
...
'Z' -> 26
 */
/*Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
The number of ways decoding "12" is 2.*/

//动态规划：任何时候遇到n=30,40,50...时，直接返回0
/*当10<n<27&&n!=20时，rst[i]==rst[i-1]+rst[i-2];
 * 当n=10||n==20时，rst[i]=rst[i-2];
 * 当n<10||n>26时，rst[i]=rst[i-1];*/
public class Solution {
    public int numDecodings(String s) {
        char[] ch = s.toCharArray();
        int len = ch.length;
        //特殊情况
        if(len==0||ch[0]=='0')  return 0;
        if(len==1) return 1;
        if((ch[1]=='0'&&ch[0]>'2')) return 0;
        //rst［0］和rst［1］单独处理
        int rst[] = new int[len];
        rst[0] = 1;
        int n = (ch[0]-'0')*10+ch[1]-'0';
        if(n>10&&n<27&&n!=20)
            rst[1] = 2;
        else
            rst[1] = 1;
        
        for(int i=2;i<len;i++){
        	//任何时候遇到30，40，50都返回0
            if(ch[i]-'0'==0&&(ch[i-1]-'0'==0||ch[i-1]-'0'>2))
                return 0;
            n = (ch[i-1]-'0')*10+ch[i]-'0';
            //以下为动态规划的3种情况
            if(n>10&&n<27&&n!=20)
                rst[i] = rst[i-1]+rst[i-2];
            else {
                if(n==10||n==20)
                    rst[i] = rst[i-2];
                else
                    rst[i] = rst[i-1];
            }
        }
        return rst[len-1];
    }
}