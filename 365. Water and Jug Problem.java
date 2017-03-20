//题意：是否可以用x、y升的两个桶测量z升水
//只需满足两个条件（1） z必须小于x, y的最大的一个. （2）z必须可以除尽x和y的最大公约数（辗转相除法）.
public class Solution {
    //（1） z必须小于x, y的最大的一个. （2）z必须可以除尽x和y的最大公约数.
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
   //求最大公约数
   public int gcd(int x,int y){
       return y==0?x:gcd(y, x%y); 
   }
}