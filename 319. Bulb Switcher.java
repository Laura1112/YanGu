//���⣺��nյ�ƣ���ʼ״̬ȫ�𣬵�һ�ο������еƣ��ڶ��θı��2,4,6...��״̬�������θı��3,6,9...��״̬......

//1��ʾ��������n���ڼ��������������Ĺ��ɣ�100 10000 1000000 100000000...

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
		
		/*//��򵥵ķ���
	    return (int)Math.sqrt(n);*/
		
		
		/*���·����ᳬʱ
		 * //����һ�����飬0��ʾ��1��ʾ��
		   //ÿһ�ζ�����һ�θ����飬���ı�����״̬
           //���ͳ���������ж��ٸ�1����Ϊ���
		int rst = 0;
		int[] state = new int[n];
		int z = 0;
		for(int i=1;i<i+1;i++){
			z=n/i;
			for(int j=1;j<z+1;j++){
				state[i*j-1] = (state[i*j-1]+1)%2;  //0ת1��1ת0
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
