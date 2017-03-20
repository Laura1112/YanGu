//题意：n位二进制数，每次改变一位，求所有排列（十进制）

//创建sList，开始存两个sList.add("0");sList.add("1");
//每次上下部分对称。上半部分是n=2时候的结果再在最高位加"0"的结果。下半部分是n=2时候的结果逆序之后再在最高位加"1"的结果
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> rst = new ArrayList<>();
        if(n==0){
            rst.add(0);
            return rst;
        }
        List<String> sList = new ArrayList<>();
        sList.add("0");
        sList.add("1");
        List<String> temp = new ArrayList<>();
        int size = 0;
        for(int i=2;i<=n;i++){
            temp = new ArrayList<>(sList);
            size = sList.size();
            for(int j=0;j<size;j++){
                sList.set(j,"0"+temp.get(j));
            }
            for(int k=size;k<2*size;k++){
                sList.add("1"+temp.get(2*size-k-1));
            }
        }
        size = sList.size();
        for(int i=0;i<size;i++){
            rst.add(Integer.parseInt(sList.get(i),2));
        }
        return rst;
    }
}
