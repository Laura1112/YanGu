import java.util.Scanner;


public class Main {
	public static int Zhedian(int[] nums){
		int count = 0;
		for(int i=1;i<nums.length-1;i++){
			if(nums[i]<nums[i-1]&&nums[i]<nums[i+1])
				count++;
			else if(nums[i]>nums[i-1]&&nums[i]>nums[i+1])
				count++;
		}
		return count;		
	}
	
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i] = in.nextInt();
		}
		System.out.println(Zhedian(nums));
	}

}
