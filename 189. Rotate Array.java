import java.util.ArrayList;
import java.util.List;

/**
 * Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * @author Laura
 *
 */

//定义一个list并填满，然后再改变每个位置上的元素，具体为list.set(index,nums[i]),最后把list上的数据赋值给nums[i]
public class Solution {
	public static int[] rotate(int[] nums, int k) {
        List<Integer> list = new ArrayList<Integer>();
        int index;
        for(int i=0;i<nums.length;i++)
        	list.add(1);				//后面用list.set()方法需要先填满list
        for(int i=0;i<nums.length;i++){
        	index = (i+k)%nums.length;
        	list.set(index,nums[i]);
        }
        for(int i=0;i<list.size();i++)
        	nums[i] = list.get(i);
        return nums;
    }
	
	public static void main(String[] arg){
		int[] nums = {1,2,3,4,5,6,7};
		int k = 0;
		int[] result = rotate(nums,k);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}
