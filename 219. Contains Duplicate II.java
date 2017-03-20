import java.util.HashMap;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i
 *  and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 * @author Laura
 *
 */


public class Solution {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int difference;
        for(int i=0;i<nums.length;i++){
        	if(map.containsKey(nums[i])){
        		difference = i-map.get(nums[i]);
        		if(difference<=k)
        			return true;
        		else
        			map.put(nums[i], i);
        	}
        	else
        		map.put(nums[i], i);
        }
        return false;
    }
	
	public static void main(String[] arg){
		int[] nums={1,2,3,2,2};
		int k = 1;
		boolean result = containsNearbyDuplicate(nums,k);
		System.out.println(result);
	}
}
