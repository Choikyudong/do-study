package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction27 {

	public static void main(String[] args) {
		// 테스트 1
		System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5

		// 테스트 2
		System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1})); // 0
	}

	public static int maxProfit(int[] prices) {
		int profit = 0;
		int min = prices[0];

		for (int i = 1; i < prices.length; i++) {
			min = Math.min(min, prices[i]);
			profit = Math.max(profit, prices[i] - min);
		}

		return profit;
	}

}
