import java.util.ArrayList;
import java.util.List;

/**
 * 求两个数组的交集（不带重复）
 * Given two arrays, write a function to compute their intersection.
Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
 * @author Laura
 *
 */

//把数组1：nums1无重复地加入到list1中；
//遍历nums2，判断每个数在list1中是否也有，若有(交集)，再判断在listRRst中是否出现过；
//若没出现就加入（需满足Each element in the result must be unique.）;
//最后再把listRst中的数赋值给数组rst
public class Solution {
	public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> listRst = new ArrayList<Integer>();
       
        for(int i=0;i<nums1.length;i++){
        	if(!list1.contains(nums1[i]))
        		list1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
        	if(list1.contains(nums2[j])){
        		if(!listRst.contains(nums2[j]))
        			listRst.add(nums2[j]);
        	}
        }
        int[] rst = new int[listRst.size()];
        for(int k=0;k<listRst.size();k++){
        	rst[k] = listRst.get(k);
        }
        return rst;
    }
	
	public static void main(String[] arg){
		int[] nums1 = {2,3,54,4,56,-1,-1,2};
		int[] nums2 = {2,4,3,5,77,56,-1};
		int[] rst = intersection(nums1,nums2);
		for(int i=0;i<rst.length;i++)
			System.out.println(rst[i]);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE>>1);
		System.out.println((Integer.MAX_VALUE>>1)+1);
	}

}
