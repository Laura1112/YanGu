import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//���⣺����һ�����飨���ظ����������п��ܵ����
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

//��78.Subsets��������һ����ֻ���ڼ���rstǰ��list�������򣬲��ж�rst���Ƿ��Ѵ��ڣ����ˣ�1����2��
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
                list.addAll(rst.get(i));       //�мǣ�����������list=rst.get(i);�����ᵼ�����������ڴ棬�Ӷ��ı�rst
                list.add(nums[j]);
                Collections.sort(list);        //��1��
                if(!rst.contains(list))			//��2��
                    rst.add(list);
            }
        }
        return rst;
    }
}