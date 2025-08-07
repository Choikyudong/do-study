package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/">
 * 문제링크
 * </a>
 */
public class Solution11 {

	public static void main(String[] args) {
		Solution11 solution = new Solution11();

		// 테스트1 : "ada"
		System.out.println(solution.firstPalindrome(
				new String[]{"abc","car","ada","racecar","cool"}
		));

		// 테스트2 : "racecar"
		System.out.println(solution.firstPalindrome(
				new String[]{"notapalindrome","racecar"}
		));
	}

	public String firstPalindrome(String[] words) {
		for (String word : words) {
			boolean isPalindrome = true;
			int length = word.length();
			for (int i = 0; i < length / 2; i++) {
				if (word.charAt(i) != word.charAt(length - (1 + i))) {
					isPalindrome = false;
					break;
				}
			}

			if (isPalindrome) {
				return word;
			}
		}
		return "";
	}

}
