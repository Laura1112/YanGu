//题意：给定数组，求全排列

//回溯
public class Solution {
    public List<List<Integer>> rst = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int[] used = new int[nums.length];
        help(nums,used,new ArrayList<>());
        return rst;
    }
    //used数组用来标记数组中的数是否被用过
    public void help(int[] nums,int[] used,List<Integer> list){
        if(list.size()==nums.length){
            rst.add(new ArrayList<>(list));
            return;       //出口
        }
        //回溯主体
        for(int i=0;i<nums.length;i++){
            if(used[i]==0){
                used[i]=1;
                list.add(nums[i]);
                help(nums,used,list);
                used[i]=0;
                list.remove(list.size()-1);
            }
        }
    }
}
