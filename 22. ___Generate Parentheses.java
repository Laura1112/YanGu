import java.util.ArrayList;
import java.util.List;
//题意：求n个括号的所有组合情况
/*
For example, given n = 3, a solution set is:
[ "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */

//回溯
/*
 * 每一次返回之后，看看是否还有"("可以用，如果有，就用一个左括号，然后进入该情况递归。
 * 如果没有，就继续返回。所以，我们需要一个左括号计数器来判断是否还有可以用的左括号。
 * 那么如何判断走到最终结果了呢？对了！右括号计数器。
 * 当右括号和左括号同时用完的时候，我们就认为走到最终结果了，直接return。
 */
public class Solution {
    List<String> rst;
    public List<String> generateParenthesis(int n) {
        rst = new ArrayList<>();
        if(n==0)    return rst;
        help("",n,n);
        return rst;
    }
    private void help(String subStr,int left,int right){
    	//每次递归的时候先检查一下剩余的右括号是否小于左括号，如果是的话，说明先写了右括号，不合法直接返回
        if(left>right)  return;
        if(left>0)
            help(subStr+"(",left-1,right);
        if(right>0)
            help(subStr+")",left,right-1);
        if(left==0&&right==0){
            rst.add(subStr);
            return;
        }
    }
}