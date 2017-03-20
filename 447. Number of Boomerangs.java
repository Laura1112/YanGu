import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//题意：求组合(p1,p2,p3)，其中p1、p2的距离和p1、p3的距离相等，(p1,p2,p3)和(p1,p3,p2)是两种情况
//计算每个点与所有点的距离平方和，并把每一个点与所有点的距离平方和存在一个hashmap中，一个点一个map，记录距离和出现的次数；
//一个点统计完，遍历map的value，计算出以该点开始可能的组合数；
//最后把所有点的组合数加起来即得结果
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int rst = 0;
        int distance = 0;
        for(int i=0;i<points.length;i++){
        	//hashMap记录距离和出现的次数
        	Map<Integer,Integer> map = new HashMap<>();
        	for(int j=0;j<points.length;j++){
        		//距离和
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
     * 统计以某个点开始可能的组合数n*(n-1)
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
     * 计算两点距离平方和
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