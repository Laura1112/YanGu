import java.util.Scanner;



public class Main {
	public static int solution(int[] h){
		int result = 0;
		int[] resultArray = new int[h.length];
		int can=0;
		int k,l,max = 0;
		for(int i=0;i<h.length;i++){
			for(k=i;k>=0&&h[k]>=h[i];k--)
				can++;
			for(l=i;l<h.length&&h[l]>=h[i];l++)
				can++;
			
			resultArray[i]=(can-1)*h[i];
			can = 0;
		}
		for(int i=0;i<h.length;i++){
			if(resultArray[i]>max){
				max = resultArray[i];
			}
		}
		result = max;
		return result;
	}
	
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] height = new int[count];
		for(int i=0;i<count;i++){
			height[i] = in.nextInt();
		}
		
			System.out.println(solution(height));
	}

}
