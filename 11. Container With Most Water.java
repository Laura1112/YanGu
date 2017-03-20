//���⣺�����������ߺ�x�����ɵ�����ݻ�

//�����߷ֱ����������ҿ�ʼ�����������߶����м������ֱ������ĳ����֮ǰ�ߵģ�����һ���ݻ�������һֱ������ֱ��left����right
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
        
        /*��ʱ����
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