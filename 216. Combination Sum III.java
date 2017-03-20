import java.util.ArrayList;
import java.util.List;

//题意：用1-9中的k个数（不重复），组成和为n的序列，求满足要求的序列

//回溯：遍历1-9，一个一个地加入subList，并计算remain，然后回溯，若和超过n（即remain<0）或当前subList的长度已超过k,则回退一步，执行subList.remove(subList.size()-1);
public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> subList = new ArrayList<Integer>();
        backtrack(list,subList,k,n,1);
        return list;
    }
    public void backtrack(List<List<Integer>> list,List<Integer> subList,int k,int remain,int start){
        if(remain<0||subList.size()>k)    return;
        else if(subList.size()==k&&remain==0){
            subList = new ArrayList<>(subList);
            list.add(subList);
        }
        else{
            for(int i=start;i<10;i++){
                subList.add(i);
                backtrack(list,subList,k,remain-i,i+1);
                subList.remove(subList.size()-1);
            }
        }
        
    }
}