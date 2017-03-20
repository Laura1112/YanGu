//题意：如何将一个数拆分成几个数相加，使得这几个数相乘最大，求最大值
//10=3+3+2+2，3×3×2×2=36 

//动态规划：除最开始几个值，当n>=6时，rst[n]=rst[n-3]*3；
public class Solution {
    public int integerBreak(int n) {
        //n小于6时，没有规律，初始化
        int[]  rst = new int[7];
        rst[1]=0;rst[2]=1;rst[3]=2;
        rst[4]=4;rst[5]=6;rst[6]=9;
        if(n<=6)
            return rst[n];
            
        //n大于6时，动态规划的状态转移方程为 rst[n]=rst[n-3]*3;    
        int z = n/3;
        int y = n%3;
        int base=1;
       
        if(y==1) base=4;
        if(y==2) base=6;
        if(y==0) base=3;
       
        for(int i=1;i<z;i++)
            base *=3;
        return base;
    }
}