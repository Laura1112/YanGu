import java.util.HashMap;
import java.util.Iterator;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * @author Laura
 *
 */

//��HashMapȥ�棬map.put(nums[i],����ֵĴ���)��������map��key,�ҳ�valueֵΪ1���������һ�Σ���key����Ϊ���
public class Solution {
	public static int singleNumber(int[] nums) {
		int result = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	if(map.containsKey(nums[i]))
        		map.put(nums[i],map.get(nums[i])+1);
        	else
        		map.put(nums[i], 1);
        }
        Iterator keys = map.keySet().iterator();
        while(keys.hasNext()){
        	Object key = keys.next();
        	if(map.get(key)==1)
        		result = (Integer) key;
        }
        return result;
    }
	
	public static void main(String[] arg){
		int[] nums ={1,1,2,3,4,3,4,5,6,5,6};
		System.out.println(singleNumber(nums));
	}
}
