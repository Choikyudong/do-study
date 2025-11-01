package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/description/">
 * 문제링크
 * </a>
 */
public class Solution28 {

	public static void main(String[] args) {
		Solution28 solution = new Solution28();

		// 테스트1 : true
		System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));

		// 테스트2 : false
		System.out.println(solution.isPalindrome("race a car"));

		// 테스트3 : true
		System.out.println(solution.isPalindrome(" "));

		// 테스트3 : false
		System.out.println(solution.isPalindrome("0P"));

		// 테스트3 : true
		System.out.println(solution.isPalindrome("a"));
	}

	public boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				sb.append(c);
			} else if (c >= 'A' && c <= 'Z') {
				sb.append((char) (c + 32));
			} else if (c >= '0' && c <= '9') {
				sb.append(c);
			}
		}

		int length = sb.length();
		for (int i = 0; i < length; i++) {
			if (sb.charAt(i) != sb.charAt(length - 1 - i)) {
				return false;
			}
		}

		return true;
	}

}

