package leetcode.pack4;

public class Solution3 {

	public static void main(String[] args) {
		Solution3 solution = new Solution3();

		// 테스트1
		System.out.println(solution.countSquares(new int[][]{
				{0, 1, 1, 1},
				{1, 1, 1, 1},
				{0, 1, 1, 1},
		})); // 15

		// 테스트1
		System.out.println(solution.countSquares(new int[][]{
				{1, 0, 1},
				{1, 1, 0},
				{1, 1, 0},
		})); // 7
	}

	public int countSquares(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		int[][] dp = new int[m][n];
		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 1) {
					if (i == 0 || j == 0) {
						dp[i][j] = matrix[i][j];
					} else {
						dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
					}
					sum += dp[i][j];
				}
			}
		}

		return sum;
	}

}
