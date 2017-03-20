import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//题意：给定一个目标值，在一个数组中找一个序列，其和等于target，一个数字可以被使用一次

//回溯，遍历数组，一个一个地想subList中加入数，且每次都记录remain，并递归，若发现和超过target（即remain<0）或已遍历至数组最后,则撤销一步，删除subList中一个元素
public class Solution {
	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        List<Integer> subList = new ArrayList<Integer>();
	        backtrack(list,subList,candidates,target,0);
	        return list;
	        
	    }
	    public void backtrack(List<List<Integer>> list,List<Integer> subList,int[] candidates,int remain,int start){
	        if(remain<0)    return;		//若走到这一步，证明当前组合的和超过target了，去执行remove一次，即撤销一步
	        else if(remain==0)  list.add(new ArrayList<>(subList));
	        else{//当i超出之后,执行一次remove
	            for(int i=start;i<candidates.length;i++){
	                subList.add(candidates[i]);
	                backtrack(list,subList,candidates,remain-candidates[i],i);
	                subList.remove(subList.size()-1);
	            }
	        }	        
	    }
}

