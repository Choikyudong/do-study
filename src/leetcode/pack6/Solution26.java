package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/description/?envType=daily-question&envId=2025-10-23">
 * 문제링크
 * </a>
 */
public class Solution26 {

	public static void main(String[] args) {
		Solution26 solution = new Solution26();

		// 테스트1 : true
		System.out.println(solution.hasSameDigits("3902"));

		// 테스트2 : false
		System.out.println(solution.hasSameDigits("34789"));
	}

	public boolean hasSameDigits(String s) {
		String str = s;
		while (str.length() != 2) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < str.length() - 1; i++) {
				int n = ((str.charAt(i) - 48) + (str.charAt(i + 1) - 48)) % 10;
				sb.append(n);
			}
			str = sb.toString();
		}

		return str.charAt(0) == str.charAt(1);
	}

}

