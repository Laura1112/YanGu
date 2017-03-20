import java.util.Arrays;

//题意：给定houses[]表示房屋所在位置，heaters[]表示热源所在位置，求热源可以辐射到所有房屋的最小距离
//先排序，再遍历houses[],寻找大于houses[i]的Heaters所在位置j（即右边最靠近houses[i]的热源位置），再做以下三种处理①②③
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);   //数组排序！！！！！！
        Arrays.sort(heaters);
        int rst = 0,tmpt = 0;
        int j=0;
        for(int i=0;i<houses.length;i++){
            while(j<heaters.length&&heaters[j]<houses[i])
                j++;
            //①当第一个热源就在houses[i]右侧时，距离为heaters[j]-houses[i]
            if(j==0)
                tmpt = heaters[j]-houses[i];
            //②当最后一个热源在houses[i]左侧时，距离为houses[i]-heaters[j-1]
            else if(j==heaters.length)
                tmpt = houses[i]-heaters[j-1];
            //③一般情况下，比较houses[i]与最近的左右热源距离，选小的
            else if(heaters[j]>=houses[i])
                tmpt = Math.min(heaters[j]-houses[i],houses[i]-heaters[j-1]);
            //当距离超过当前值，则替换
            if(tmpt>rst)
                rst = tmpt;
        }
        return rst;
    }
}