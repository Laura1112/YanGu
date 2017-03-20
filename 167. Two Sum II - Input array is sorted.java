import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author Laura
 *
 */

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
    	/*for(int i=0;i<numbers.length-1;i++){
		for(int j=i+1;j<numbers.length;j++){
			if(numbers[i]+numbers[j]==target){
				result[0] = i+1;
				result[1] = j+1;
				break;
			}
		}
	}*/   	
    	int[] result = new int[2];    	
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i=0;i<numbers.length;i++){
    		Integer n = map.get(numbers[i]);	//n的类型是Integer
    		if(n==null)
    			map.put(numbers[i], i);
    		Integer m = map.get(target-numbers[i]);
    		if(m!=null&&m<i){
    			result[0] = m+1;
   				result[1] = i+1;
   				return result;
   			}
    		
    	}
    	return result;
    	      
    }
    
    public static void main(String[] arg){
    	int[] nums = {0,0,3,2};
    	int target=0;
    	twoSum(nums,target);
    	System.out.println("["+twoSum(nums,target)[0]+","+twoSum(nums,target)[1]+"]");  
    }
}
