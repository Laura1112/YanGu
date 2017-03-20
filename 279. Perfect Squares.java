//题意：给定一个正整数，求最少可以拆分成几个平方和，如12＝4+4+4（返回3）、13=9+4（返回2）

//四平方和定理：任意一个正整数均可表示为4个整数的平方和，
//一个数如果含有因子4，那么我们可以把4都去掉，并不影响结果
//一个数除以8余7的话，那么肯定是由4个完全平方数组成
public class Solution {
    public int numSquares(int n) {
        while(n%4==0)  
            n = n/4;
        if(n%8==7)  
            return 4;
        for(int a=0;a<Math.sqrt(n);a++){
            int b = (int)Math.sqrt(n-a*a);
            if(a*a+b*b==n){
                if(a!=0&&b!=0)
                    return 2;
                return 1;
            }
        }
        return 3;
    }
}