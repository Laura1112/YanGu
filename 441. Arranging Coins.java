//���⣺����n��Ӳ�ң��󰴵Ȳ������ųɽ���״�����Ŷ�����
/*��n=8,������3��
 * ��
 * �� ��
 * �� �� ��
 * �� ��*/

//�Ȳ�������͹�ʽ����1+i��*i/2
//����ֻҪ�ҳ������㣨1+i��*i/2<=n��iֵ�Ϳ��ԣ�i<=Math.sqrt(n)*Math.sqrt(2),ע��Խ�磩
//����Ҫע��Խ�����⣬������Ҫ�ж�i����ż�������٢�ִ��
public class Solution {
    public int arrangeCoins(int n){
        int start = (int)(Math.sqrt(n)*Math.sqrt(2));
        for(int i=start;i>=0;i--){
        	//ż
            if(i%2==0&&i/2*(i+1)<=n)
                return i;
            //��
            else if(i%2==1&&(i+1)/2*i<=n)
                return i;
        }
        return 0;
    }
}
