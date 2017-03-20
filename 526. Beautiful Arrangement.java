//题意：给定1,2,3,4，...,N这样N个数，求有符合要求的组合，满足两者其一：
//(1)The number at the ith position is divisible by i.
//(2)i is divisible by the number at the ith position.

//回溯进行全排列，同时判断是否满足上述条件
public class Solution {
    int rst;
    public int countArrangement(int N) {
        help(N,1,new int[N+1]);
        return rst;
    }
    public void help(int N,int th,int[] used){
        if(th>N){
            rst++;
            return;
        }
        for(int i=1;i<=N;i++){
            if(used[i]==0&&(i%th==0||th%i==0)){
                    used[i]=1;
                    help(N,th+1,used);
                    used[i]=0;
            }
        }
    }
}
