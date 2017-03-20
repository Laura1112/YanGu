//题意:给定一个数组，求F[i]
/*A = [4, 3, 2, 6]

F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26

So the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.*/

//公式：F[i]=F[i-1]+sum-A[len-i]*len;
public class Solution {
    public int maxRotateFunction(int[] A) {
        int len = A.length;
        int f = 0,sum = 0;
        for(int i=0;i<len;i++){
            f += i*A[i];
            sum += A[i];
        }
        int rst= f;
        for(int i=1;i<len;i++){
            f = f+sum-A[len-i]*len;
            if(f>rst)
                rst = f;
        }
        return rst;
        /*超时
        int rst = 0;
        int value = 0;
        int len = A.length;
        for(int i=0;i<len;i++){
            value = 0;
            for(int j=0;j<len;j++){
                value += (i+j)%len*A[j];
            }
            if(value>rst)
                rst = value;
        }
        return rst;*/
        
    }
}