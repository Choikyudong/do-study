package leetcode.pack3;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/generate-parentheses/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction5 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(generateParenthesis(3)); // ["((()))","(()())","(())()","()(())","()()()"]

		// 테스트2
		System.out.println(generateParenthesis(1)); // ["()"]
	}

	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		helper(list, 0, 0, n, new StringBuilder());
		return list;
	}

	static void helper(List<String> list, int start, int end, int n, StringBuilder sb) {
		int length = sb.length();
		if (start == n && end == n) {
			list.add(sb.toString());
			return;
		}

		if (start < n) {
			sb.append("(");
			helper(list, start + 1, end, n, sb);
		}

		if (end < n && end < start) {
			sb.append(")");
			helper(list, start, end + 1, n, sb);
		}

		if (length > 0) {
			sb.setLength(length - 1);
		}
	}

}

