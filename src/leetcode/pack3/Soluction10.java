package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/minimum-path-sum/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction10 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(minPathSum(new int[][]{
				{1,3,1},{1,5,1},{4,2,1}
		})); // 7

		// 테스트2
		System.out.println(minPathSum(new int[][]{
				{1,2,3},{4,5,6}
		})); // 12
	}

	public static int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;

		int[][] dp = new int[m][n];
		dp[0][0] = grid[0][0];
		for (int i = 1; i < m; i++) {
			dp[i][0] = grid[i][0] + dp[i - 1][0];
		}

		for (int i = 1; i < n; i++) {
			dp[0][i] = grid[0][i] + dp[0][i - 1];
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
			}
		}

		return dp[m - 1][n - 1];
	}

}
