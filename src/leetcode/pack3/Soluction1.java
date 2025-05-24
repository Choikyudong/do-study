package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/fibonacci-number/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction1 {


	public static void main(String[] args) {
		// 테스트1
		System.out.println(fib(2));

		// 테스트2
		System.out.println(fib(3));

		// 테스트3
		System.out.println(fib(4));
	}

	public static int fib(int n) {
		int[] dp = new int[31];
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
	}

}

