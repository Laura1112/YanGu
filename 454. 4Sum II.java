import java.util.HashMap;
import java.util.Map;

//���⣺�ڵȳ����ĸ��������ѡһ������ʹ���ĸ�����Ϊ0�����ж��������

//��hashMap��A��B��������������֮�ͼ����ֵĴ���
//�ٱ���C��D���������������֮�ͣ���ȡhashMap���Ӧ��-1*(C[m]+D[n]
//map.getOrDefault(key,default);��ȡvalue���������ڣ�����default
public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map = new HashMap<>();
        int len = A.length;
        int rst = 0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                map.put(A[i]+B[j],map.getOrDefault(A[i]+B[j],0)+1);
            }
        }
        for(int m=0;m<len;m++){
            for(int n=0;n<len;n++){
                rst += map.getOrDefault(-1*(C[m]+D[n]),0);
            }
        }
        return rst;
    }
}


