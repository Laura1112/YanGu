//题意：判断一个数是否是一个平方数，不能使用库函数，如sqrt
//先将num转化成String，判断其有几位，从而判断开根号结果有几位，为了提高效率还可以通过判断是长度为奇/偶，确定开根号结果第一个数的范围
//然后再在该范围内遍历求具体的值，注意溢出问题
public class Solution {
	public boolean isPerfectSquare(int num) {
        String s = Integer.toString(num);
        int len = s.length();
        //确定开根号后值有几位
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
