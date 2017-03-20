//题意：求电话键盘拨号可能的字母组合

//回溯，回溯内的小循环是每个键的三四个字母，回溯的大循环是输入的String
public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> rst = new ArrayList<>();
        if(digits.length()==0||digits.contains("0")||digits.contains("1")){
            return rst;
        }
        String[] guide = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        char[] ch = digits.toCharArray();
        int begin=0;
        char[] pre = new char[digits.length()];
        help(guide,ch,begin,pre,rst);
        return rst;

    }
    //回溯
    public void help(String[] guide,char[] ch,int begin,char[] pre,List<String> rst){
        int len = ch.length;
        if(begin==len){
            rst.add(new String(pre));
            return;         //出口
        }

        int tempNum = ch[begin]-'0';
        //小循环：每个键的三四个字母
        for(int i=0;i<guide[tempNum].length();i++){
            pre[begin] = guide[tempNum].charAt(i);  //第begin位共有guide[tempNum].length()种取法
            help(guide,ch,begin+1,pre,rst);
        }
    }
}
