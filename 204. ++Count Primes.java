import java.util.Arrays;
import java.util.Scanner;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * @author Laura
 *
 */
public class Solution {
	public static int countPrimes(int n) {
		if(n<=2)
			return 0;
		int count=n/2;  //Ö»¿¼ÂÇÆæÊý
		boolean[] prime = new boolean[n];
		Arrays.fill(prime, true);
		for(int i=3;i<Math.sqrt(n);i+=2){
			if(!prime[i])   //false
				continue;
			int num = 3*i;
			while(num<n){
				if(prime[num])  //true
					count--;
				prime[num]=false;
				num+=2*i;
			}
		}
		return count;
		
        
    }
	
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(countPrimes(n));
	}

}
