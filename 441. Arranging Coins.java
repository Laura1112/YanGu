//题意：给定n个硬币，求按等差数列排成阶梯状可以排多少行
/*如n=8,可以排3行
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤*/

//等差数列求和公式：（1+i）*i/2
//所以只要找出能满足（1+i）*i/2<=n的i值就可以（i<=Math.sqrt(n)*Math.sqrt(2),注意越界）
//但是要注意越界问题，所以需要判断i的奇偶，并按①②执行
public class Solution {
    public int arrangeCoins(int n){
        int start = (int)(Math.sqrt(n)*Math.sqrt(2));
        for(int i=start;i>=0;i--){
        	//偶
            if(i%2==0&&i/2*(i+1)<=n)
                return i;
            //奇
            else if(i%2==1&&(i+1)/2*i<=n)
                return i;
        }
        return 0;
    }
}
