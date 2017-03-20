import java.util.ArrayList;
import java.util.List;

//题意：给定一个数组（无重复），求所有可能的组合
/*
For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]*/

//初始的rst中只存储一个空的list，然后遍历nums，每便利到一个数，就将rst中所有list都加上该数，然后再放入rst中
//注意：！！！不能用list=rst.get(i);这样会导致它俩公用内存，从而改变rst，应该用list.addAll(rst.get(i));
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        int len = nums.length;
        rst.add(list);
        
        for(int j=0;j<len;j++){
            int size = rst.size();
            for(int i=0;i<size;i++){
                list = new ArrayList<Integer>();
                list.addAll(rst.get(i));       //切记！！！不能用list=rst.get(i);这样会导致它俩公用内存，从而改变rst
                list.add(nums[j]);
                rst.add(list);
            }
        }
        return rst;
    }
}