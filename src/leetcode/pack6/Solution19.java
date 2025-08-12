package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/number-of-common-factors/description/">
 * 문제링크
 * </a>
 */
public class Solution19 {

	public static void main(String[] args) {
		Solution19 solution = new Solution19();

		// 테스트1 : 4
		System.out.println((solution.commonFactors(12, 6)));

		// 테스트2 : 2
		System.out.println((solution.commonFactors(25, 30)));
	}

	public int commonFactors(int a, int b) {
		int count = 0;

		int min = Math.min(a, b);
		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {
				count++;
			}
		}

		return count;
	}

}
