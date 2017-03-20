//���⣺����int[] A,��������ٸ��Ȳ����У���������Ϊ3
/*
 A = [1, 2, 3, 4]
return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.*/

//�������飬��pre��now��suf�ֱ��ǰһ������ǰ����һ�������ж�now-pre==suf-now��������ʾ��һ��3��������ɵĵȲ����У�count++���������else
//�������rst+=((1+count)*count)/2;��Ϊ�����󲻽���else����©
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
            //�жϵȲ�
            if(now-pre==suf-now)
                count++;
            else{
                //count��ʾ�ж���������3��������ɵĵȲ����У��Ӷ����⴮���ֿ�����ɶ��ٸ��Ȳ�����
                rst+=((1+count)*count)/2;   
                count=0;
            }
        }
        rst+=((1+count)*count)/2;
        return rst;
        
    }
}