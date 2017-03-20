import java.util.HashMap;
import java.util.Map;

//题意：在等长的四个数组里各选一个数，使得四个数和为0，求有多少种组合

//用hashMap存A、B两个数组里两两之和即出现的次数
//再遍历C、D两个数组里的两两之和，获取hashMap里对应的-1*(C[m]+D[n]
//map.getOrDefault(key,default);获取value，若不存在，返回default
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


