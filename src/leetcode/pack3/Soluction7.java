package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/unique-paths/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction7 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(uniquePaths(3, 7)); // 28

		// 테스트2
		System.out.println(uniquePaths(3, 2)); // 3

		// 테스트2
		System.out.println(uniquePaths(1, 1)); // 3
	}

	public static int uniquePaths(int m, int n) {
		int[][] dp = new int[m][n];
		for (int i = 0; i < m; i++) {
			dp[i][0] = 1;
		}
		for (int j = 0; j < n; j++) {
			dp[0][j] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}
		return dp[m - 1][n - 1];
	}

}

