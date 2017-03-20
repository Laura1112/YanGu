//题意：求任意两条线和x轴可组成的最大容积

//两条线分别从最左和最右开始，左右两根线都向中间遍历，直到遇到某根比之前高的，就算一遍容积，否则一直遍历，直到left＝＝right
public class Solution {
    public int maxArea(int[] height) {
        int cap = 0;
        int left = 0,right = height.length-1;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            cap = Math.max(cap,h*(right-left));
            while(height[left]<=h&&left<right)  left++;
            while(height[right]<=h&&left<right) right--;
        }
        return cap;
        
        /*超时方法
        int cap = 0;
        int max = 0;
        for(int i=0;i<height.length;i++){
            int j=height.length-1;
            while(j>i){
                if(height[j]<height[i])
                    cap = height[j]*(j-i);
                else
                    cap = height[i]*(j-i);
                if(cap>max)
                max = cap;
                j--;
            }
        }
        return max;*/
    }
}