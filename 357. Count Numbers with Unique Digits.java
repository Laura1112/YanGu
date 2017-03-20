//题意：求0-10的n次方之间有多少个数，这些数每一位都不相同

//1位数：C10,1；  
//2位数：C9,1*C9,1
//3位数：C9,1*C9,1*C8,1
//4位数：C9,1*C9,1*C8,1*C7,1
//...
//最后把所有的相加
public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int rst = 10;
        for(int i=2;i<=n;i++){
           rst += combination(i);
        }
        return rst;
    }
    
    public int combination(int n){
        int count = 9;
        for(int i=1;i<n;i++){
            count *= (10-i);
        }
        return count;
    }
}