import java.util.ArrayList;
import java.util.List;

//题意：以范围形式表示数组，如[0,1,2,4,5,7], return ["0->2","4->5","7"].

//遍历数组，设置start和end，开始end＝start，然后end不断向后遍历，当不满足与前一个差为1时停止，同时也要保证end没有越界
//若end＝start，则rst.add(""+start);否则rst.add(start+"->"+end);
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