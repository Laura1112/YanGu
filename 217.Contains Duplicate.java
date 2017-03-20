import java.util.HashMap;


public class Solution {
	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]))
				return true;
			else
				map.put(nums[i], 1);
		}
		return false;
        
    }
	
	public static void main(String[] arg){
		int[] nums={3,4,5,6,9,0};
		System.out.println(containsDuplicate(nums));
		
	}
}
