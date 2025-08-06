package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/count-of-matches-in-tournament/">
 * 문제링크
 * </a>
 */
public class Solution8 {

	public static void main(String[] args) {
		Solution8 solution = new Solution8();

		// 테스트1 : 6
		System.out.println(solution.numberOfMatches(7));

		// 테스트2 : 13
		System.out.println(solution.numberOfMatches(14));
	}

	public int numberOfMatches(int n) {
		int ans = 0;

		while (n > 1) {
			if (n % 2 == 0) {
				ans += n / 2;
				n = n / 2;
			} else {
				ans += (n - 1) / 2;
				n = ((n - 1) / 2) + 1;
			}
		}

		return ans;
	}

}
