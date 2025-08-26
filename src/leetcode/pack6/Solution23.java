package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/">
 * 문제링크
 * </a>
 */
public class Solution23 {

	public static void main(String[] args) {
		Solution23 solution = new Solution23();

		// 테스트1 : 7
		System.out.println((solution.maxProfit(new int[]{7,1,5,3,6,4})));

		// 테스트2 : 4
		System.out.println((solution.maxProfit(new int[]{1,2,3,4,5})));

		// 테스트3 : 0
		System.out.println((solution.maxProfit(new int[]{7,6,4,3,1})));
	}

	/* 좀 어렵게 품
	public int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int length = prices.length;
		for (int i = 0; i < length; i++) {
			if (min > prices[i]) {
				min = prices[i];
			} else {
				int max = prices[i];
				for (int j = i + 1; j < length; j++, i++) {
					if (max < prices[j]) {
						max = prices[j];
					} else {
						break;
					}
				}
				sum += max - min;
				min = Integer.MAX_VALUE;
			}
		}

		return sum;
	}
	*/

	public int maxProfit(int[] prices) {
		int sum = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				sum += prices[i] - prices[i - 1];
			}
		}
		return sum;
	}

}

