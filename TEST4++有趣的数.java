/*import java.util.Scanner;


public class Main {
	public static long funNum(int n){
		long result = 0;
		for(long i=2*(long)Math.pow(10, n-1);i<2*(long)Math.pow(10,n-1)+4*(long)Math.pow(10,n-2);i++){
			long z=i;
			int j=0;
			long[] y=new long[n+1];
			int[] ha=new int[4];
			while(z!=0){
				y[j] = z%10;
				if(y[j]==0)
					ha[0]=1;
				
				if(y[j]==1)
					ha[1]=1;
				
				if(y[j]==2)
					ha[2]=1;
				
				if(y[j]==3)
					ha[3]=1;
				
				z = z/10;
				j++;
			}
			int p;
			int index = n;
			for(p=index-1;p>=0;p--){
				if(y[p]==1){
					for(int q=p-1;q>=0;q--){
						if(y[q]==0){
							p=-1;
							index=-1;
						}
					}
				}
				else if(y[p]==3){
					for(int q=p-1;q>=0;q--){
						if(y[q]==2){
							p=-1;
							index=-1;
						}
					}
				}
			}
			
			if(p==-1&&ha[0]==1&&ha[1]==1&&ha[2]==1&&ha[3]==1){
				result=(result+1)%1000000007;
			}
		}
		return result;
	}

	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();		
		System.out.println(funNum(n));
		
			
	}
}
*/
import java.util.*;
public class Main { 
	public static void main(String[] args) { 
		new Main().run(); 
	}
	public void run() { 
		Scanner fin = new Scanner(System.in);
		int N = fin.nextInt(); 
		long[] count = new long[8]; 
		count[6] = 0; 
		count[7] = 1; 
		long mod = 1000000007; 
		for (int i = 2; i <= N; ++i) { 
			long[] newCount = new long[8]; 
			newCount[0] = (count[0] * 2 + count[1] + count[3]) % mod; 
			newCount[1] = (count[1] * 2 + count[2] + count[5]) % mod; 
			newCount[2] = (count[2] + count[6]) % mod; 
			newCount[3] = (count[3] * 2 + count[4] + count[5]) % mod; 
			newCount[4] = (count[4] + count[7]) % mod; 
			newCount[5] = (count[5] * 2 + count[6] + count[7]) % mod; 
			newCount[6] = 0; 
			newCount[7] = 1;
			count = newCount; 
		}
		System.out.println(count[0]); 
	} 
}

/*��ʵ�㷨�ܼ򵥡�

����Ҫһ������ǰ�ᣬ�������Ŀ��û��˵����������һЩ©����
������N���ƣ����� N >10ʱ������� 9,10,11,12, �������֣�����ʱ��Ҫ���� 10 ���ʮ������ʱ��û���κη�����������ϡ�)

ǡ����nλ����Ȥ�����ĸ��� Ϊ (N-2)(N-1)/2

�� N = 4 ʱ, 0,1,2,3 ���� (4-2)(4-1)/2 = 3 ������*/