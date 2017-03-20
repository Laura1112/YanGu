//���⣺��0-10��n�η�֮���ж��ٸ�������Щ��ÿһλ������ͬ

//1λ����C10,1��  
//2λ����C9,1*C9,1
//3λ����C9,1*C9,1*C8,1
//4λ����C9,1*C9,1*C8,1*C7,1
//...
//�������е����
public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int rst = 10;
        for(int i=2;i<=n;i++){
           rst += combination(i);
        }
        return rst;
    }
    
    public int combination(int n){
        int count = 9;
        for(int i=1;i<n;i++){
            count *= (10-i);
        }
        return count;
    }
}