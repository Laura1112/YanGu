import java.util.Arrays;

//题意：求一个研究者的影响因子n：给你一个数组表示所发表的论文的影响因子，求n，有n篇影响因子大于等于n的文章
//对数组排序，若长度为0或所有文章影响因子都为0则返回0
//从头开始遍历，直到影响因子大于等于剩下的未遍历的数组长度，即找到这个n
public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        if(len==0||citations[len-1]==0)
            return 0;
        int i=0;
        while(citations[i]<len){
            i++;
            len--;
        }
        return len;
    }
}