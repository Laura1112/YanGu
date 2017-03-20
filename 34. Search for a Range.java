//���⣺����һ������ n ���������������飬�ҳ�����Ŀ��ֵ target ����ʼ�ͽ���λ�á����Ŀ��ֵ���������У��򷵻�[-1, -1]

//�ö��ֲ��ҷ��ҵ�һ��target����λ�ã�Ȼ���ٷֱ��������ұ�����ֱ���ҵ��߽�
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] rst = {-1,-1};
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<target)    low = mid+1;
            else if(nums[mid]>target)   high = mid-1;
            else{
                int left=mid-1;
                int right=mid+1;
                while(left>-1&&nums[left]==nums[mid])
                    left--;
                rst[0] = left+1;
                while(right<nums.length&&nums[right]==nums[mid])
                    right++;
                rst[1] = right-1;
                break;
            }
        }
        return rst;
    }
}