import java.util.ArrayList;
import java.util.List;

//���⣺����һ�����飨���ظ����������п��ܵ����
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

//��ʼ��rst��ֻ�洢һ���յ�list��Ȼ�����nums��ÿ������һ�������ͽ�rst������list�����ϸ�����Ȼ���ٷ���rst��
//ע�⣺������������list=rst.get(i);�����ᵼ�����������ڴ棬�Ӷ��ı�rst��Ӧ����list.addAll(rst.get(i));
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
                list.addAll(rst.get(i));       //�мǣ�����������list=rst.get(i);�����ᵼ�����������ڴ棬�Ӷ��ı�rst
                list.add(nums[j]);
                rst.add(list);
            }
        }
        return rst;
    }
}