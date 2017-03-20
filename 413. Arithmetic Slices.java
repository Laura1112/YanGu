//题意：给定int[] A,求包含多少个等差数列，长度至少为3
/*
 A = [1, 2, 3, 4]
return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.*/

//遍历数组，用pre、now、suf分别存前一个、当前、后一个数，判断now-pre==suf-now，相等则表示有一个3个数字组成的等差数列，count++，否则进入else
//最后勿忘rst+=((1+count)*count)/2;因为如果最后不进入else，会漏
public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length<3)
            return 0;
        int pre,now,suf;
        int count = 0;
        int len = A.length;
        int rst = 0;
        for(int i=1;i<len-1;i++){
            pre = A[i-1];
            now = A[i];
            suf = A[i+1];
            //判断等差
            if(now-pre==suf-now)
                count++;
            else{
                //count表示有多少连续的3个数字组成的等差数列，从而求这串数字可以组成多少个等差数列
                rst+=((1+count)*count)/2;   
                count=0;
            }
        }
        rst+=((1+count)*count)/2;
        return rst;
        
    }
}