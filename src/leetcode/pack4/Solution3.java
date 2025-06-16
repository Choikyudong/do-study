package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/painting-a-grid-with-three-different-colors/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Solution3 {

	public static void main(String[] args) {
		Solution3 solution = new Solution3();

		// 테스트1
		System.out.println(solution.maxSumAfterPartitioning(
				new int[]{1,15,7,9,2,5,10},
				3
		)); // 84

		// 테스트2
		System.out.println(solution.maxSumAfterPartitioning(
				new int[]{1,4,1,5,7,3,6,1,9,9,3},
				4
		)); // 83

		// 테스트3
		System.out.println(solution.maxSumAfterPartitioning(
				new int[]{1},
				1
		)); // 1
	}

	public int maxSumAfterPartitioning(int[] arr, int k) {
		int n = arr.length;
		int[] dp = new int[n + 1]; // dp[i] = arr[0..i-1]까지 최댓값
		for (int i = 1; i <= n; i++) {
			int maxInPartition = 0;
			for (int j = 1; j <= k && i - j >= 0; j++) {
				maxInPartition = Math.max(maxInPartition, arr[i - j]);
				dp[i] = Math.max(dp[i], dp[i - j] + maxInPartition * j);
			}
		}
		return dp[n];
	}

}
