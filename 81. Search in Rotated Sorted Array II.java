import java.util.Arrays;


//���⣺һ���������飬������ѯת������[1,4,6,7,1,2,3],�ڸ����������Ƿ����target

//�������ٶ��ֲ��ң����ֲ��ҵ�low��high��Ӧ�����±꣡��������дһ����ֲ��ң�
public class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>target)
                high = mid-1;
            else if(nums[mid]<target)
                low = mid+1;
            else
                return true;
        }
        return false;
    }
}