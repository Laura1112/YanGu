import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//���⣺����һ��Ŀ��ֵ����һ����������һ�����У���͵���target��һ�����ֿ��Ա�ʹ��һ��

//���ݣ��������飬һ��һ������subList�м���������ÿ�ζ���¼remain�����ݹ飬�����ֺͳ���target����remain<0�����ѱ������������,����һ����ɾ��subList��һ��Ԫ��
public class Solution {
	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        List<Integer> subList = new ArrayList<Integer>();
	        backtrack(list,subList,candidates,target,0);
	        return list;
	        
	    }
	    public void backtrack(List<List<Integer>> list,List<Integer> subList,int[] candidates,int remain,int start){
	        if(remain<0)    return;		//���ߵ���һ����֤����ǰ��ϵĺͳ���target�ˣ�ȥִ��removeһ�Σ�������һ��
	        else if(remain==0)  list.add(new ArrayList<>(subList));
	        else{//��i����֮��,ִ��һ��remove
	            for(int i=start;i<candidates.length;i++){
	                subList.add(candidates[i]);
	                backtrack(list,subList,candidates,remain-candidates[i],i);
	                subList.remove(subList.size()-1);
	            }
	        }	        
	    }
}

