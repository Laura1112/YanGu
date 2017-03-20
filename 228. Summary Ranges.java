import java.util.ArrayList;
import java.util.List;

//���⣺�Է�Χ��ʽ��ʾ���飬��[0,1,2,4,5,7], return ["0->2","4->5","7"].

//�������飬����start��end����ʼend��start��Ȼ��end����������������������ǰһ����Ϊ1ʱֹͣ��ͬʱҲҪ��֤endû��Խ��
//��end��start����rst.add(""+start);����rst.add(start+"->"+end);
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> rst = new ArrayList<String>();
        int len = nums.length;
        if(len==0) return rst;
        int i = 0;
        while(i<len){
            int start = nums[i];
            int end = nums[i];
            int j=i+1;
            while(j<len&&nums[j]-nums[j-1]==1){
                end = nums[j++];
            }
            if(end==start)
                rst.add(""+start);
            else
                rst.add(start+"->"+end);
            i=j;
        }
        return rst;
    }
}