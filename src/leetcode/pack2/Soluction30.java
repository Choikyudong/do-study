package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/min-cost-climbing-stairs/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction30 {

	public static void main(String[] args) {
		// 테스트 1
		System.out.println(minCostClimbingStairs(new int[]{10, 15, 20})); // 15

		// 테스트 2
		System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})); // 6
	}

	public static int minCostClimbingStairs(int[] cost) {
		int[] dp = new int[cost.length];
		dp[0] = cost[0];
		dp[1] = cost[1];
		for (int i = 2; i < cost.length; i++) {
			dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
		}

		return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
	}

}
