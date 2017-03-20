import java.util.HashMap;
import java.util.Iterator;




public class Solution {
	 public static int majorityElement(int[] nums) {
		 int result = 0;
		 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		 for(int i=0;i<nums.length;i++){
			 if(map.containsKey(nums[i])){
				 map.put(nums[i], map.get(nums[i])+1);
			 }
			 else
				 map.put(nums[i], 1);
		 }
		 int max=-1;
		 Object maxK = -1;
		 Iterator keys = map.keySet().iterator();
		 while(keys.hasNext()){
			 Object key = keys.next();
			 Integer value = map.get(key);
			 if(value>max){
				 max=value;
				 maxK = key;
			 }
		 }
		 
		 if(max>nums.length/2)
			 result=(Integer) maxK;
		 return result;        
	 }
	 
	 public static void main(String[] arg){
		 int[] nums = {0,1,5,4,6,5,5,5,5};
		 System.out.println(majorityElement(nums));
	 }

}

