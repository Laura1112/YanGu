//题意：一个数组表示一段时间内的股价，可多次买卖，但必须买一次卖一次，问最多可赚多少

//法一：遍历数组，只要当前值大于前一个数就卖出，拿收益
//法二：画折线图，记录所有的极大值和极小值（包括水平线的凹点（极小）和凸点（极大）），所有上升直线的差即为获利值；为避免连续出现两个极大值或极小值（折线图出现梯形），用balance来保证极大值和极小值的匹配

public class Solution {
    public int maxProfit(int[] prices) {
        //只要当前值比前一个大就卖出
        int rst = 0;
        int len = prices.length;
        for(int i=1;i<len;i++){
            if(prices[i]>prices[i-1])
                rst += prices[i]-prices[i-1];
        }
        return rst;
        //以下方法按折线图的极大值－极小值思路解决的
/*        int len= prices.length;
        if(len<=1) return 0;
        
        int low=0;
        int i=1;
        while(i<len&&prices[i]==prices[i-1]){
            i++;
        }
        if(i==len)
            return 0;
        int balance = 0;
        if(prices[i]>prices[i-1]){
            low = prices[i-1];
            balance++;
        }
            
        int rst = 0;
        
        for(int j=i;j<len-1;j++){
            if((prices[j]>prices[j+1]&&prices[j]>=prices[j-1])||(prices[j]>=prices[j+1]&&prices[j]>prices[j-1])){
                if(balance==1){
                    rst+=prices[j]-low;     //prices[j]是极大值
                    balance--;
                }
            }
            else if((prices[j]<=prices[j+1]&&prices[j]<prices[j-1])||(prices[j]<prices[j+1]&&prices[j]<=prices[j-1])){
                if(balance==0){
                    low = prices[j];        //prices[j]是极小值
                    balance++;
                }
            }
        }
        if(balance>0&&prices[len-1]>low)
            rst+=prices[len-1]-low;
        return rst;*/
    }
}