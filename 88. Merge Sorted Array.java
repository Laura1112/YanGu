import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) 
to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 
are m and n respectively.
 * @author Laura
 *
 */

//把nums1的前m个 和 nums2的前n个 都加入到list中，并用Collections.sort(list)排序，再赋值到nums1中，即得结果
public class Solution {
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<m;i++){
        	list.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
        	list.add(nums2[i]);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        	nums1[i]=list.get(i);
        return nums1;
    }
	
	public static void main(String[] arg){
		int[] nums1 = {2,3,5,6,7,9};
		int[] nums2 = {1,1,2,3,7,8};
		int m=3,n=2;
		int[] result  = merge(nums1,m,nums2,n);  //一定一定要先赋值给result，再使用merge函数
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		
	}
}
