import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//���⣺�����(p1,p2,p3)������p1��p2�ľ����p1��p3�ľ�����ȣ�(p1,p2,p3)��(p1,p3,p2)���������
//����ÿ���������е�ľ���ƽ���ͣ�����ÿһ���������е�ľ���ƽ���ʹ���һ��hashmap�У�һ����һ��map����¼����ͳ��ֵĴ�����
//һ����ͳ���꣬����map��value��������Ըõ㿪ʼ���ܵ��������
//�������е����������������ý��
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int rst = 0;
        int distance = 0;
        for(int i=0;i<points.length;i++){
        	//hashMap��¼����ͳ��ֵĴ���
        	Map<Integer,Integer> map = new HashMap<>();
        	for(int j=0;j<points.length;j++){
        		//�����
        		distance = distance(points[i][0],points[i][1],points[j][0],points[j][1]);
        		if(map.containsKey(distance))
        			map.put(distance, map.get(distance)+1);
        		else
        			map.put(distance, 1);
        	}
        	rst +=count(map);       	
        }
        return rst;
    }
    /*
     * ͳ����ĳ���㿪ʼ���ܵ������n*(n-1)
     */
    public int count(Map<Integer,Integer>map){
    	int count = 0;
    	Iterator values = map.values().iterator();
    	while(values.hasNext()){
    		int value = (int) values.next();
    		count += value*(value-1);
    	}
    	return count;
    }
    /*
     * �����������ƽ����
     */
    public int distance(int p1x,int p1y,int p2x,int p2y){
    	return (int) (Math.pow((p2x-p1x), 2)+Math.pow(p2y-p1y,2));   	
    }
    
    public static void main(String[] arg){
    	int[][] points = {{0,0},{1,1},{-1,1},{-1,-1},{1,-1}};
    	Solution t = new Solution();
    	System.out.println(t.numberOfBoomerangs(points));
    }
}