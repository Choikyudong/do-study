package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/">
 * 문제링크
 * </a>
 */
public class Solution5 {

	public static void main(String[] args) {
		Solution5 solution = new Solution5();

		// 테스트1 : true
		System.out.println(solution.reverseWords("Let's take LeetCode contest"));

		// 테스트2 : false
		System.out.println(solution.reverseWords("Mr Ding"));
	}

	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		String[] strings = s.split(" ");

		for (String str : strings) {
			sb.append(new StringBuilder(str).reverse()).append(" ");
		}

		return sb.toString().trim();
	}

}
