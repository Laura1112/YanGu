/**
 * 其他更好的方法：http://blog.csdn.net/u014082714/article/details/51867973   用HashMap！Iterator！entrySet！
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static int mostFrequent(int[] num){
		int result=0;
		int[] a = new int[num.length];
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<num.length;i++){
			if(list.contains(num[i]))
				a[list.indexOf(num[i])]++;
			else
				list.add(num[i]);
		}
		int index=0;
		for(int j=1;j<a.length;j++){
			if(a[index]<a[j]){
				index=j;
			}
			else if(a[index]==a[j]&&list.get(index)>list.get(j)){
				index=j;
			}
		}
		result = list.get(index);
		return result;
	}
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++){
			num[i] = in.nextInt();
		}
		System.out.println(mostFrequent(num));		
	}
	
}
