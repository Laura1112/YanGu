//拆分字符串，所有的子串都是回文串
/*For example, given s = "aab",
Return
[
  ["aa","b"],
  ["a","a","b"]
]
*/

//回溯，从前向后取回文子串，剩下的递归，直到剩下的子串长度为0
public class Solution {
    List<List<String>> rst = new ArrayList<>();
    public List<List<String>> partition(String s) {
        help(s,new ArrayList<String>(),rst);
        return rst;
    }
    public void help(String s,List<String> list,List<List<String>> rst){
        if(s.length()==0){
            rst.add(new ArrayList<>(list));
            return;       //出口
        }
        for(int i=1;i<=s.length();i++){
            String temp = s.substring(0,i);
            if(isPalindrome(temp)){
                list.add(temp);
                help(s.substring(i,s.length()),list,rst);
                list.remove(list.size()-1);     //出口出来之后一定要清除list中的内容
            }
        }
    }
    //判断回文串
    public boolean isPalindrome(String str){
        String reverse = new StringBuffer(str).reverse().toString();
        if(reverse.equals(str))
            return true;
        else
            return false;
    }
}
