import java.util.ArrayList;
import java.util.List;

//题意：给定一个全是素数的数组primes［］，求第n个super ugly number，其质因数只能包含primes中的数

//每个primes[i]都有对应的idx[i], 表示该素数目前已经乘到第几个super ugly number了
//每求一个rst[n]，就遍历一遍primes，求出最小的primes[ j ]*rst[ idx[j] ]
//其中遇到相同的最小值，通过将j加入list中，再idx[list.get(k)]++
public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] rst = new int[n];
        rst[0] = 1;
        int len = primes.length;
        int[] idx = new int[len];
        int min = primes[0]*rst[idx[0]];

        for(int i=1;i<n;i++){
            List<Integer> list = new ArrayList<Integer>();   
            list.add(0);
            min = primes[0]*rst[idx[0]];
            for(int j=1;j<len;j++){
                //！！！去除重复：如有两个素数*idx相等，则把j加入list中
                if(primes[j]*rst[idx[j]]==min)
                    list.add(j);
                else{
                    min = Math.min(min,primes[j]*rst[idx[j]]);
                    if(min==primes[j]*rst[idx[j]]){
                        list = new ArrayList<Integer>();  //清空之前定义的list！！！！！
                        list.add(j);
                    }            
                }  
            }
            for(int k=0;k<list.size();k++){
                idx[list.get(k)]++;
            }
            rst[i]=min;
        }
        return rst[n-1];
    }
}