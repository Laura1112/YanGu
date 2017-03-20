//���⣺�ҳ���n�����֣���
/*Input:11
Output:0
Explanation:
The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
*/

//
public class Solution {
    public int findNthDigit(int n) {
    	/*
         * �����ǲο����ϵĽ�
         */
        //С�����
        int digitType = 1;
        long digitNum = 9;
        //��λ���Ǽ�λ��
        while(n > digitNum*digitType){
            n -= (int) digitNum*digitType ;
            digitType++;
            digitNum*=10;
        }
        //��λ������Щ��λ������ĵڼ����ĵڼ�λ
        int indexInSubRange = (n -1) / digitType;
        int indexInNum = (n -1) % digitType;
        //��ԭ����
        int num = (int)Math.pow(10,digitType - 1) + indexInSubRange ;
        int result = Integer.parseInt((""+num).charAt(indexInNum)+"");
        return result;
    	
       /* ע�͵��ķ����ᳬʱ���������г����е���
       int num = 1;
        int c = 0;
        int y = num,z=0,mi=0;
        for(int i=1;i<=n;i++){
            mi = (int)Math.pow(10,c);
            z = y/mi;
            y = y%mi;
            c--;
            if(c<0){
                num++;
                y = num;
                c = (int)Math.log10(y);
            }
        }
        return z;*/
       
    }
}