import java.util.ArrayList;
import java.util.List;

//���һ�������ξ���Ķ��˵�������һ�������������·���ͣ�ÿ��ֻ������һ���������ڵ�����Ԫ���е�һ���ƶ�

//�ӵ�һ�㿪ʼ��һ������£����㵽��ÿ��Ԫ�ص���С·���ͣ���������ist�У��ٰ�ÿһ���list�浽rst�У����γ�List<List<Integer>>����ʽ
//ע��ÿ���һ�������һ��Ԫ�ز���Ҫ�Ƚϣ�ֱ�Ӽ��룬��������
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
            list.add(rst.get(i-1).get(0)+triangle.get(i).get(0));   //  ÿ�е�һ��ֵ
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