//���⣺һ�������ʾһ��ʱ���ڵĹɼۣ��ɶ����������������һ����һ�Σ�������׬����

//��һ���������飬ֻҪ��ǰֵ����ǰһ������������������
//������������ͼ����¼���еļ���ֵ�ͼ�Сֵ������ˮƽ�ߵİ��㣨��С����͹�㣨���󣩣�����������ֱ�ߵĲΪ����ֵ��Ϊ��������������������ֵ��Сֵ������ͼ�������Σ�����balance����֤����ֵ�ͼ�Сֵ��ƥ��

public class Solution {
    public int maxProfit(int[] prices) {
        //ֻҪ��ǰֵ��ǰһ���������
        int rst = 0;
        int len = prices.length;
        for(int i=1;i<len;i++){
            if(prices[i]>prices[i-1])
                rst += prices[i]-prices[i-1];
        }
        return rst;
        //���·���������ͼ�ļ���ֵ����Сֵ˼·�����
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
                    rst+=prices[j]-low;     //prices[j]�Ǽ���ֵ
                    balance--;
                }
            }
            else if((prices[j]<=prices[j+1]&&prices[j]<prices[j-1])||(prices[j]<prices[j+1]&&prices[j]<=prices[j-1])){
                if(balance==0){
                    low = prices[j];        //prices[j]�Ǽ�Сֵ
                    balance++;
                }
            }
        }
        if(balance>0&&prices[len-1]>low)
            rst+=prices[len-1]-low;
        return rst;*/
    }
}