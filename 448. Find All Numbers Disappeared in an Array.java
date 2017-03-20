import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//���⣺�ҳ�����������ȱʧ��������ȷ������ӦΪ1 �� a[i] �� n (n = size of array)�����������е����ֳ��ֹ�1��2��

/*
Input:
[4,3,2,7,8,2,3,1]
Output:
[5,6]*/

//�������飬����TreeSet�У�����ȥ�ز�����
//Ȼ���1��n���set���Ƿ���ڣ����������ʾ����ȱʧ

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> rst = new ArrayList<Integer>();
		Set<Integer> set = new TreeSet<Integer>();
		for(int i:nums) set.add(i);
		
		int len = nums.length;
		for(int i=1;i<=len;i++){
		    if(!set.contains(i))
		        rst.add(i);
		}
		return rst;
    }
}
