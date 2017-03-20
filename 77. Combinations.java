//题意：从1到n中选k个数，求所有可能组合（Cnk），并返回
/*If n = 4 and k = 2, a solution is:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
*/

//只求组合【Cnk=n!/(k!*(n-k)!)】，不求排列【Ank=n!/(n-k)!】
//回溯，因为不用考虑顺序，,所以加一个参数past，后加入的数与前一个数比较，必须比它大
//若求排列，则去掉该参数即可
public class Solution {
    public List<List<Integer>> rst = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int[] used = new int[n+1];
        help(n,k,0,used,0,list,rst);
        return rst;
    }
    public void help(int n,int k,int idx,int[] used,int past,List<Integer> list,List<List<Integer>> rst){
        if(idx==k){
            rst.add(new ArrayList<>(list));
            return;
        }
        for(int i=1;i<=n;i++){
            if(used[i]==0&&i>past){
                used[i]=1;
                list.add(i);
                help(n,k,idx+1,used,i,list,rst);
                list.remove(list.size()-1);
                used[i]=0;
            }
        }
    }
}
