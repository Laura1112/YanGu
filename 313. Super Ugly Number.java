import java.util.ArrayList;
import java.util.List;

//���⣺����һ��ȫ������������primes�ۣݣ����n��super ugly number����������ֻ�ܰ���primes�е���

//ÿ��primes[i]���ж�Ӧ��idx[i], ��ʾ������Ŀǰ�Ѿ��˵��ڼ���super ugly number��
//ÿ��һ��rst[n]���ͱ���һ��primes�������С��primes[ j ]*rst[ idx[j] ]
//����������ͬ����Сֵ��ͨ����j����list�У���idx[list.get(k)]++
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
                //������ȥ���ظ���������������*idx��ȣ����j����list��
                if(primes[j]*rst[idx[j]]==min)
                    list.add(j);
                else{
                    min = Math.min(min,primes[j]*rst[idx[j]]);
                    if(min==primes[j]*rst[idx[j]]){
                        list = new ArrayList<Integer>();  //���֮ǰ�����list����������
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