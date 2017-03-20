import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//题意:给定一串表示数字的字符串，且乱序，求包含哪些数字，最终返回从小到大排序的阿拉伯数字
/*Input: "fviefuro"
Output: "45"*/

//先用HashMap统计s中的字符及出现的次数
//然后一级一级判断，一级：z→0，w→2，u→4，x→6，g→8；二级：o→1，h→3，s→7；三级：v→5，i→9

/*或用以下方法：
numbers[8] = letters['g'];
numbers[6] = letters['x'];
numbers[4] = letters['u'];
numbers[2] = letters['w'];
numbers[0] = letters['z'];
numbers[5] = letters['f'] - numbers[4];
numbers[3] = letters['h'] - numbers[8];
numbers[7] = letters['s'] - numbers[6];
numbers[1] = letters['o'] - numbers[0] - numbers[2] - numbers[4];
numbers[9] = letters['i'] - numbers[5] - numbers[6] - numbers[8];*/

public class Solution {
    public String originalDigits(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        String rst="";
        char ch;
        //用map统计s中的字符
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            if(!map.containsKey(ch))
                map.put(ch,1);
            else
                map.put(ch,map.get(ch)+1);
        }
        //=======一级
        if(map.containsKey('z')){
            int z_count = map.get('z');
            for(int i=0;i<z_count;i++)
                list.add(0);
            map.put('z',map.get('z')-z_count);
            map.put('e',map.get('e')-z_count);
            map.put('r',map.get('r')-z_count);
            map.put('o',map.get('o')-z_count);
        }
        if(map.containsKey('w')){
            int w_count = map.get('w');
            for(int i=0;i<w_count;i++)
                list.add(2);
            map.put('t',map.get('t')-w_count);
            map.put('w',map.get('w')-w_count);
            map.put('o',map.get('o')-w_count);
        }
        if(map.containsKey('u')){
            int u_count = map.get('u');
            for(int i=0;i<u_count;i++)
                list.add(4);
            map.put('f',map.get('f')-u_count);
            map.put('o',map.get('o')-u_count);
            map.put('u',map.get('u')-u_count);
            map.put('r',map.get('r')-u_count);
        }
        if(map.containsKey('x')){
            int x_count = map.get('x');
            for(int i=0;i<x_count;i++)
                list.add(6);
            map.put('s',map.get('s')-x_count);
            map.put('i',map.get('i')-x_count);
            map.put('x',map.get('x')-x_count);
        }
        if(map.containsKey('g')){
            int g_count = map.get('g');
            for(int i=0;i<g_count;i++)
                list.add(8);
            map.put('e',map.get('e')-g_count);
            map.put('i',map.get('i')-g_count);
            map.put('g',map.get('g')-g_count);
            map.put('h',map.get('h')-g_count);
            map.put('t',map.get('t')-g_count);
        }
        //=====二级
        if(map.containsKey('o')&&map.get('o')>0){
            int o_count = map.get('o');
            for(int i=0;i<o_count;i++)
                list.add(1);
            map.put('o',map.get('o')-o_count);
            map.put('n',map.get('n')-o_count);
            map.put('e',map.get('e')-o_count);
        }
        if(map.containsKey('h')&&map.get('h')>0){
            int h_count = map.get('h');
            for(int i=0;i<h_count;i++)
                list.add(3);
            map.put('t',map.get('t')-h_count);
            map.put('h',map.get('h')-h_count);
            map.put('r',map.get('r')-h_count);
            map.put('e',map.get('e')-h_count*2);
        }
        if(map.containsKey('s')&&map.get('s')>0){
            int s_count = map.get('s');
            for(int i=0;i<s_count;i++)
                list.add(7);
            map.put('s',map.get('s')-s_count);
            map.put('e',map.get('e')-s_count*2);
            map.put('v',map.get('v')-s_count);
            map.put('n',map.get('n')-s_count);
        }
        //=======三级
        if(map.containsKey('v')&&map.get('v')>0){
            int v_count = map.get('v');
            for(int i=0;i<v_count;i++)
                list.add(5);
            map.put('f',map.get('f')-v_count);
            map.put('i',map.get('i')-v_count);
            map.put('v',map.get('v')-v_count);
            map.put('e',map.get('e')-v_count);
        }
        if(map.containsKey('i')&&map.get('i')>0){
            int i_count = map.get('i');
            for(int i=0;i<i_count;i++)
                list.add(9);
            map.put('n',map.get('n')-i_count*2);
            map.put('i',map.get('i')-i_count);
            map.put('e',map.get('e')-i_count);
        }
        Collections.sort(list);
        for(int n:list)
            rst = rst+n;
        return rst;
    }
}
