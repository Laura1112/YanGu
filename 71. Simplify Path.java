import java.util.Stack;

//题意：简化文件路径，如：gy/Laura/.././px/...//Alan/ ->/gy/px/.../Alan, /.. -> /, /. ->/

//去掉开头的'/'，结尾处加上'/',然后遍历path，遇到'/'的时候就对这个子串做处理，具体如下
//最后在堆栈中一个一个取出子串，连成最终的结果，并对一些特殊情况做处理
public class Solution {
    public String simplifyPath(String path) {
        if(path.length()==0) return "/";
        if(path.charAt(0)=='/'&&path.length()>1)
            path = path.substring(1,path.length());
        if(path.charAt(path.length()-1)!='/')
            path = path+'/';
        
        char[] ch = path.toCharArray();
        Stack<StringBuilder> s =  new Stack<>();
        StringBuilder tmp = new StringBuilder();
        int len = path.length();
        for(int i=0;i<len;i++){
            tmp.append(ch[i]);
            if(ch[i]=='/'){
                switch(tmp.toString()){
                case "./":
                	break;
                case "/":
                	break;
                case "../":
                	if(!s.isEmpty())
                		s.pop();
                	break;               
                default:
                	s.push(tmp);
                }               
                tmp = new StringBuilder();
            }
        }
        String rst = "";
        while(!s.isEmpty())
        	rst = s.pop().toString()+rst;
        //特殊情况
        if(rst.equals(""))
            rst = "/";
        else
            rst = '/'+rst;
        if(rst.length()>1)
            rst = rst.substring(0,rst.length()-1);
        return rst;
    }
}