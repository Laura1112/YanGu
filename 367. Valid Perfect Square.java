//���⣺�ж�һ�����Ƿ���һ��ƽ����������ʹ�ÿ⺯������sqrt
//�Ƚ�numת����String���ж����м�λ���Ӷ��жϿ����Ž���м�λ��Ϊ�����Ч�ʻ�����ͨ���ж��ǳ���Ϊ��/ż��ȷ�������Ž����һ�����ķ�Χ
//Ȼ�����ڸ÷�Χ�ڱ���������ֵ��ע���������
public class Solution {
	public boolean isPerfectSquare(int num) {
        String s = Integer.toString(num);
        int len = s.length();
        //ȷ�������ź�ֵ�м�λ
        int midlen = (len+1)/2; 
        int mid;
        if(len%2==1)
            mid=1;
        else
            mid = 3;
        for(int i=1;i<midlen;i++){
            mid *=10;
        }
        //sqrt(2147483647)=46340.95...
        while(mid<=46340&&mid*mid<num)
            mid++;
        if(mid*mid!=num)
            return false;
        return true;
    }
}
