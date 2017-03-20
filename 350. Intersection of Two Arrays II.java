import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * ����������Ľ��������ظ���
 * Given two arrays, write a function to compute their intersection.
Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
 * @author Laura
 *
 */

//��HashMap������nums1��ÿ�����ֺ�����ֵĴ�����
//��������nums2����map�д��ڸ�������value������0������list�м��룬�ҽ�map�и�����Ӧ��value��1��
//����һ������洢list������ݣ����ظ�����
public class Solution {
	public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
        	if(map.containsKey(nums1[i]))
        		map.put(nums1[i], map.get(nums1[i])+1);
        	else
        		map.put(nums1[i], 1);
        }
        for(int j=0;j<nums2.length;j++){
        	if(map.containsKey(nums2[j])&&map.get(nums2[j])!=0){
        		list.add(nums2[j]);
        		map.put(nums2[j], map.get(nums2[j])-1);
        	}
        }
        int[] rst = new int[list.size()];
        for(int i =0;i<list.size();i++)
        	rst[i] = list.get(i);
        return rst;
    }
	
	public static void main(String[] arg){
		int[] n1={1,2,3,3,4,5,5,-1,-1};
		int[] n2={9,1,3,3,6,-1,-1};
		int[] rst = intersect(n1,n2);
		for(int i=0;i<rst.length;i++){
			System.out.println(rst[i]);
		}
	}
}
