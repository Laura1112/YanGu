import java.util.ArrayList;
import java.util.List;

//���⣺��1-9�е�k���������ظ�������ɺ�Ϊn�����У�������Ҫ�������

//���ݣ�����1-9��һ��һ���ؼ���subList��������remain��Ȼ����ݣ����ͳ���n����remain<0����ǰsubList�ĳ����ѳ���k,�����һ����ִ��subList.remove(subList.size()-1);
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