//���⣺��һ���ַ������ж��ٸ�Ƭ�Σ��Կո�Ϊ�ָ�
//����ǰ�ַ�����Ϊ�գ���ǰһ���ַ���Ϊ�գ����1
public class Solution {
    public int countSegments(String s) {
        int rst = 0;
        char ex = ' ';
        char now = ' ';
        for(int i=0;i<s.length();i++){
            now = s.charAt(i);
            if(now!=' '&&ex==' ')
                rst++;
            ex = now;
        }
        return rst;
    }
}