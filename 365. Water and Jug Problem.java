//���⣺�Ƿ������x��y��������Ͱ����z��ˮ
//ֻ����������������1�� z����С��x, y������һ��. ��2��z������Գ���x��y�����Լ����շת�������.
public class Solution {
    //��1�� z����С��x, y������һ��. ��2��z������Գ���x��y�����Լ��.
   public boolean canMeasureWater(int x, int y, int z) {
        if(z>x+y)
            return false;
        if(z==0)
            return true;
        if(x==0){
            if(z==y)
                return true;
            else
                return false;
        }
        if(y==0){
            if(z==x)
                return true;
            else 
                return false;
        }
        if(z%gcd(y,x%y)==0)
            return true;
        return false;
   }
   //�����Լ��
   public int gcd(int x,int y){
       return y==0?x:gcd(y, x%y); 
   }
}