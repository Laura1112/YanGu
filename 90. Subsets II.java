import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//题意：给定一个数组（有重复），求所有可能的组合
/*
 For example,
If nums = [1,2,2], a solution is:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]*/

//和78.Subsets方法基本一样，只是在加入rst前对list进行排序，并判断rst中是否已存在，多了（1）（2）
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
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
                Collections.sort(list);        //（1）
                if(!rst.contains(list))			//（2）
                    rst.add(list);
            }
        }
        return rst;
    }
}