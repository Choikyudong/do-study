package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/encode-and-decode-tinyurl/">
 * 문제링크
 * </a>
 */
public class Solution23 {

	public static void main(String[] args) {
		Solution23 solution = new Solution23();

		// 테스트1 : "Hello how are you"
		System.out.println((solution.truncateSentence("Hello how are you Contestant", 4)));

		// 테스트2 : "What is the solution"
		System.out.println((solution.truncateSentence("What is the solution to this problem", 4)));
	}

	public String truncateSentence(String s, int k) {
		String[] strings = s.split(" ");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(strings[i]);
			if (i + 1 < k) {
				sb.append(" ");
			}
		}

		return sb.toString();
	}

}
