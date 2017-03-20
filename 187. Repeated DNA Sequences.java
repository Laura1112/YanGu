import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//题意：求一个字符串中出现至少两次的子串，且长度为10

//从0遍历至倒数第十个数，将每个长度为10的子串都存入hashmap中
//存入之前若map.containsKey(subS)&&!rst.contains(subS)即出现不止一次，且未存入结果中，则是满足结果的子串
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> rst = new ArrayList<>();
        int len = s.length();
        if(len<=10)
            return rst;
        String subS;
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<=len-10;i++){
            subS = s.substring(i,i+10);
            if(map.containsKey(subS)&&!rst.contains(subS))
                rst.add(subS);
            map.put(subS,i);
        }
        return rst;
    }
}