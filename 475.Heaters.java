import java.util.Arrays;

//���⣺����houses[]��ʾ��������λ�ã�heaters[]��ʾ��Դ����λ�ã�����Դ���Է��䵽���з��ݵ���С����
//�������ٱ���houses[],Ѱ�Ҵ���houses[i]��Heaters����λ��j�����ұ����houses[i]����Դλ�ã��������������ִ���٢ڢ�
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);   //�������򣡣���������
        Arrays.sort(heaters);
        int rst = 0,tmpt = 0;
        int j=0;
        for(int i=0;i<houses.length;i++){
            while(j<heaters.length&&heaters[j]<houses[i])
                j++;
            //�ٵ���һ����Դ����houses[i]�Ҳ�ʱ������Ϊheaters[j]-houses[i]
            if(j==0)
                tmpt = heaters[j]-houses[i];
            //�ڵ����һ����Դ��houses[i]���ʱ������Ϊhouses[i]-heaters[j-1]
            else if(j==heaters.length)
                tmpt = houses[i]-heaters[j-1];
            //��һ������£��Ƚ�houses[i]�������������Դ���룬ѡС��
            else if(heaters[j]>=houses[i])
                tmpt = Math.min(heaters[j]-houses[i],houses[i]-heaters[j-1]);
            //�����볬����ǰֵ�����滻
            if(tmpt>rst)
                rst = tmpt;
        }
        return rst;
    }
}