/**
 * You are climbing a stair case. It takes n steps to reach to the top. Each
 * time you can either climb 1 or 2 steps. In how many distinct ways can you
 * climb to the top?
 * @author Laura
 * 
 */

//���⣺һ����������¥�ݣ��ж���������
//��ʵ��쳲���������һ������D(i)=D(i-1)+D(i-2);
//ע�⵱ֻ��һ��̨��ʱ������������
public class Solution {
	public int climbStairs(int n) {
        int[] d = new int[n]; 
        d[0] = 1;
        if(n>1){
	        d[1] = 2;
	        int prepre = d[0];
	        int pre = d[1];
	        for(int i=2;i<n;i++){
	        	d[i] = pre+prepre;
	        	prepre = pre;
	        	pre = d[i];
	        }
        }
        return d[n-1];
    }
	
	public static void main(String[] arg){
		int n = 1;
		Solution t = new Solution();
		System.out.println(t.climbStairs(n));
	}
}
