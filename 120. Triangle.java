import java.util.ArrayList;
import java.util.List;

//求从一个三角形矩阵的顶端到最下面一层任意数的最短路径和，每次只能向下一层左右相邻的两个元素中的一个移动

//从第一层开始，一层层往下，计算到达每个元素的最小路径和，并存在入ist中，再把每一层的list存到rst中，即形成List<List<Integer>>的形式
//注意每层第一个和最后一个元素不需要比较，直接加入，单独处理
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if(triangle==null) return 0;
        List<Integer> list = new ArrayList<Integer>();
        int min = triangle.get(0).get(0);
        list.add(min);
        rst.add(list);
    
        for(int i=1;i<triangle.size();i++){
            list = new ArrayList<Integer>();
            list.add(rst.get(i-1).get(0)+triangle.get(i).get(0));   //  每行第一个值
            for(int j=1;j<i;j++){
                min = Math.min(rst.get(i-1).get(j-1),rst.get(i-1).get(j))+triangle.get(i).get(j);
                list.add(min);
            }
            list.add(rst.get(i-1).get(i-1)+triangle.get(i).get(i));
            rst.add(list);
        }
        
        int count=rst.size();
        List<Integer> lastrow = rst.get(count-1);
        int minimum = lastrow.get(0);
        for(int k=1;k<count;k++){
            if(lastrow.get(k)<minimum)
                minimum = lastrow.get(k);
        }
        return minimum;
    }
}