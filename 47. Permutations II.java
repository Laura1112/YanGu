/*题意：全排列（去除重复）
[1,1,2] have the following unique permutations:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
*/

//与46的全排列相比，进入循环多了一次判断
public class Solution {
    public List<List<Integer>> rst = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int[] used = new int[nums.length];
        help(nums,0,used,new ArrayList<>(),rst);
        return rst;
    }
    public void help(int[] nums,int idx,int[] used,List<Integer> list,List<List<Integer>> rst){
        if(idx==nums.length){
            rst.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            //若遇到重复的则不递归
            if(i > 0 && used[i-1]==0 && nums[i] == nums[i-1]){
                continue;
            }
            if(used[i]==0){
                used[i]=1;
                list.add(nums[i]);
                help(nums,idx+1,used,list,rst);
                used[i]=0;
                list.remove(list.size()-1);
            }
        }
    }
}
