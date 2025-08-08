package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/decompress-run-length-encoded-list/description/">
 * 문제링크
 * </a>
 */
public class Solution13 {

	public static void main(String[] args) {
		Solution13 solution = new Solution13();

		// 테스트1 : [2,4,4,4]
		System.out.println((solution.removeOuterParentheses(
				"(()())(())"
		)));

		// 테스트2 : [1,3,3]
		System.out.println((solution.removeOuterParentheses(
				"(()())(())(()(()))"
		)));
	}

	public String removeOuterParentheses(String s) {
		StringBuilder sb = new StringBuilder();
		int depth = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				if (depth > 0) {
					sb.append(c);
				}
				depth++;
			} else {
				depth--;
				if (depth > 0) {
					sb.append(c);
				}
			}
		}

		return sb.toString();
	}

}
