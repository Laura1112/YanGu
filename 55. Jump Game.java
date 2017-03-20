import java.util.ArrayList;
import java.util.List;

//题意：求从第一个数能否跳到最后，每个数代表其可跳的最远距离

//定义一个list，表示可以到达的点的位置（从后向前遍历）
//只要当前值>=可到达最近有效点的距离，则该点位置就可以被加入list中，最终判断0是否被加入，即可判断是否可以从开始跳到最后
public class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        list.add(len-1);
        for(int i=len-2;i>=0;i--){
            int dis = list.get(list.size()-1)-i;
            if(nums[i]>=dis)
                list.add(i);
        }
        if(list.contains(0))
            return true;
        else
            return false;
    }
}