//���⣺�ҳ���n��ugly number����������ֻ����2��3��5

//2��3��5�ֱ��ж�Ӧ��idx����ʾĿǰ2/3/5��ڼ���ugly�������
//����ǰrst[i]ѡ�еĻ���Ϊ2/3/5�������Ӧ��idx++
public class Solution {
    public int nthUglyNumber(int n) {
        int idx2=0, idx3=0, idx5=0;
        int[] rst = new int[n];
        rst[0] = 1;
        for(int i=1;i<n;i++){
            rst[i] = Math.min(Math.min(2*rst[idx2],3*rst[idx3]),5*rst[idx5]);
            if(rst[i]==2*rst[idx2])
                idx2++;
            if(rst[i]==3*rst[idx3])
                idx3++;
            if(rst[i]==5*rst[idx5])
                idx5++;
        }
        return rst[n-1];
    }
}


