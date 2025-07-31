package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/hash-divided-string/">
 * 문제링크
 * </a>
 */
public class Solution27 {

	public static void main(String[] args) {
		Solution27 solution = new Solution27();

		// 테스트1 : "bf"
		System.out.println((solution.stringHash("abcd", 2)));

		// 테스트2 : "i"
		System.out.println((solution.stringHash("mxz", 3)));
	}

	public String stringHash(String s, int k) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length();) {
			int charSum = 0;
			for (int j = 0; j < k; j++) {
				charSum += (int) s.charAt(i++) - 'a';
			}
			result.append((char) ((charSum % 26) + 'a'));
		}
		return result.toString();
	}

}
