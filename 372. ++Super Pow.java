//求a的b次方（b是数组）
/*a = 2
b = [1,0]
Result: 1024*/

//遍历int[] b,结果为res = pow(res, 10) * pow(a, b[i]) % 1337;
public class Solution {
   public int superPow(int a, int[] b) { 
        int res = 1;  
        for (int i = 0; i < b.length; i++) {  
            res = pow(res, 10) * pow(a, b[i]) % 1337;  //调用pow(int,int);
        }  
        return res;  
   }  
  
   /*
    * 求a的b次方
    */
    public int pow(int a, int b) {  
        if (b == 0) return 1;  
        if (b == 1) return a % 1337;  
        return pow(a % 1337, b / 2) * pow(a % 1337, b - b / 2) % 1337;  //对幂进行处理
    }  
}