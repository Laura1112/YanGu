import java.util.Scanner;

/**
 * mplement atoi to convert a string to an integer.
 * @author Laura
 *
 */

public class Solution {
	public int atoi(String str) {
		int max = 2147483647;
		int min = -2147483648;
		int result = 0;
		int len = str.length();
		int start = -1;
		boolean neg = false;
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (ch == '+' || ch == '-' || (ch >= '0' && ch <= '9')) {
				start = i;
				break;		//break直接跳出for循环体！！！！！
			} else if (ch == ' ') {

			} else {
				break;
			}
		}
		if (start == -1)
			return 0;

		if (str.charAt(start) == '-' || str.charAt(start) == '+') {
			if (str.charAt(start) == '-')
				neg = true;
			start++;
		}

		for (int i = start; i < len; i++) {
			char ch = str.charAt(i);
			char next = 0;
			if (i + 1 < len)
				next = str.charAt(i + 1);
			if (ch < '0' || ch > '9')
				break;
			result = 10 * result + (ch - '0');

			if (next >= '0' && next <= '9') {
				if (result > max / 10) {
					if (neg)
						return min;
					else
						return max;
				}

				if (result == max / 10) {
					if (neg) {
						if (next - '0' >= 8)
							return min;
						else
							return -1 * (10 * result + (next - '0'));

					} else {
						if (next - '0' >= 7)
							return max;
						else
							return 10 * result + (next - '0');
					}
				}
			}

		}
		if (neg)
			result = -result;

		return result;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().atoi(" -1010023630"));
		System.out.println(new Solution().atoi(" -1010023630o4"));
		System.out.println(new Solution().atoi("    10522545459"));
		System.out.println(new Solution().atoi("   123"));
		System.out.println(new Solution().atoi("  -123"));
		System.out.println(new Solution().atoi("  +123"));
		System.out.println(new Solution().atoi("  -1234bbsf3"));
		System.out.println(new Solution().atoi("  2147483646"));
		System.out.println(new Solution().atoi("  2147483647"));
		System.out.println(new Solution().atoi("  2147483648"));
		System.out.println(new Solution().atoi("  2147483649"));
		System.out.println(new Solution()
				.atoi("  11111111111111111111111111111111111111111111111111"));

		System.out.println(new Solution().atoi(" -2147483647"));
		System.out.println(new Solution().atoi(" -2147483648"));
		System.out.println(new Solution().atoi(" -2147483649"));
		System.out.println(new Solution()
				.atoi("  -11111111111111111111111111111111111111111111111111"));
		System.out.println(new Solution().atoi("0"));
		System.out.println(new Solution().atoi("abc"));

	}

}
