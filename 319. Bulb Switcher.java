//题意：有n盏灯，初始状态全灭，第一次开启所有灯，第二次改变第2,4,6...的状态，第三次改变第3,6,9...的状态......

//1表示亮，无论n等于几，最终有这样的规律：100 10000 1000000 100000000...

public class Solution {
	public static int bulb(int n){		
		int count = 0;
		int start = 3;
		int m = 0;
		while(count<n){
		    count += start;
		    start = start+2;
		    m++;
		}
		return m;
		
		/*//最简单的方法
	    return (int)Math.sqrt(n);*/
		
		
		/*以下方法会超时
		 * //定义一个数组，0表示灭，1表示亮
		   //每一次都遍历一次该数组，并改变数组状态
           //最后统计数组里有多少个1，即为结果
		int rst = 0;
		int[] state = new int[n];
		int z = 0;
		for(int i=1;i<i+1;i++){
			z=n/i;
			for(int j=1;j<z+1;j++){
				state[i*j-1] = (state[i*j-1]+1)%2;  //0转1，1转0
			}
		}
		
		for(int i=0;i<n;i++){
			if(state[i]==1)
				rst++;
		}
		return rst;*/
	}
	
	public static void main(String[] arg){
		int n=20;
		System.out.println(bulb(n));
	}
}
