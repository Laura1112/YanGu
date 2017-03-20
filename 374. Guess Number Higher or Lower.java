/**
 * We are playing the Guess Game. The game is as follows:
I pick a number from 1 to n. You have to guess which number I picked.
Every time you guess wrong, I'll tell you whether the number is higher or lower.
You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
Example:
n = 10, I pick 6.
Return 6.
 * @author Laura
 *
 */

//题意：猜数字
//二分查找法
public class Solution extends GuessGame{
	public  int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low<=high){
        	int mid = low+(high-low)/2;
        	int rst = guess(mid);
        	if(rst==0)
        		return mid;
        	else if(rst<0)
        		high = mid-1;
        	else
        		low = mid+1;
        }
        return -1;
    }

	public static void main(String[] arg){
		int n = 6;
		Solution t = new Solution();
		int rst = t.guessNumber(n);
		System.out.println(rst);
	}
}


public class GuessGame {
	public int guess(int num){
		int needToGuess = 2;
		if(num>needToGuess)
			return -1;
		if(num<needToGuess)
			return 1;
		return 0;
	}

}
