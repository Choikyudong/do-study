package leetcode.pack3;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/construct-smallest-number-from-di-string/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction18 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(smallestNumber("IIIDIDDD")); // 53

		// 테스트2
		System.out.println(smallestNumber("DDD")); // 13
	}

	public static String smallestNumber(String pattern) {
		StringBuilder sb = new StringBuilder();

		int n = pattern.length();
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i <= n; i++) {
			stack.push(i + 1);
			if (i == n || pattern.charAt(i) == 'I') {
				while (!stack.empty()) {
					sb.append(stack.pop());
				}
			}
		}

		return sb.toString();
	}

}
