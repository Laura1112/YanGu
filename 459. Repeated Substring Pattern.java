import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//���⣺�жϸ����ַ����Ƿ���һ�����ַ����ظ��γɵģ���abcabcabc,����abc�ظ��γ�
//��������ַ������ȵ�����������������������list�У��ٽ�list����
//�Ӵ�Сȡ��list�е�����ÿ����������ܵ��Ӵ����ȣ���str����ͬ�����Ƚسɶ�ݣ��Ƚ�ÿ���Ƿ���ͬ����ÿ�ݶ���ͬ�򷵻�true��
//��������list����û�ҵ�һ���Ӵ���ʹ��ÿ�ݶ���ͬ���򷵻�false
//str����Ϊ1���Լ������ַ��ظ��ģ���bbbbb����Ҫ�������ǣ���
public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int length = str.length();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for(int i=2;i<=Math.sqrt(length);i++){
            if(length%i==0){
                list.add(i);
                list.add(length/i);
            }
        }
        Collections.sort(list);
        String subString = "";
        int count = 0;
        int sublength;
        for(int i=list.size()-1;i>=0;i--){
            sublength = list.get(i);
            subString = str.substring(0,sublength);
            count = length/sublength;
            if(count==1)
                return false;
            int j;
            for(j=1;j<count;j++){
                if(!str.substring(sublength*j,sublength*(j+1)).equals(subString)){
                    break;
                }
                else
                    continue;
            }
            if(j==count)
                return true;
        }
        return false;
    }
}