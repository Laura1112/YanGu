import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//求给定数组里第三大的数字，重复的不占
//将给定数组存入TreeSet中（去重+排序），再将set存入list中（方便使用get方法）
//若list长度小于3，则取最后一个数，否则取倒数第三个数
public class Solution {
    public int thirdMax(int[] nums) {
    	//TreeSet可以去重复，并实现自动排序，但是没有get方法，所以需转成list
    	Set<Integer> set =  new TreeSet<Integer>();
        for(int i:nums)
            set.add(i);
        List<Integer> list = new ArrayList<Integer>(set);
        if(list.size()<3)
            return list.get(list.size()-1);
        else
            return list.get(set.size()-4);
    }
}