package leetcode.pack5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/maximum-score-from-removing-substrings/description/?envType=daily-question&envId=2025-07-23">
 * 문제링크
 * </a>
 */
public class Solution11 {

	public static void main(String[] args) {
		Solution11 solution = new Solution11();

		// 테스트1 : 19
		System.out.println(solution.maximumGain("cdbcbbaaabab", 4, 5));

		// 테스트2 : 20
		System.out.println(solution.maximumGain("aabbaaxybbaabb", 5, 4));

		// 테스트3 : 198644
		System.out.println(solution.maximumGain("aabbrtababbabmaaaeaabeawmvaataabnaabbaaaybbbaabbabbbjpjaabbtabbxaaavsmmnblbbabaeuasvababjbbabbabbasxbbtgbrbbajeabbbfbarbagha", 8484, 4096));
	}

	/* 기존 방식.. 넘 느림
	public int maximumGain(String s, int x, int y) {
		int ans = 0;
		if (x > y) {
			ans += removePairs(s, 'a', 'b', x);
			s = replaceString(s, 'a', 'b');
			ans += removePairs(s, 'b', 'a', y);
		} else {
			ans += removePairs(s, 'b', 'a', y);
			s = replaceString(s, 'b', 'a');
			ans += removePairs(s, 'a', 'b', x);
		}
		return ans;
	}

	public int removePairs(String s, char first, char second, int score) {
		int total = 0;
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == first && c == second) {
				total += score;
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		return total;
	}

	public String replaceString(String s, char first, char second) {
		Deque<Character> deque = new ArrayDeque<>();
		for (char c : s.toCharArray()) {
			if (!deque.isEmpty() && deque.peekLast() == first && c == second) {
				deque.pollLast();
			} else {
				deque.offer(c);
			}
		}

		StringBuilder sb = new StringBuilder();
		while (!deque.isEmpty()) {
			sb.append(deque.pollFirst());
		}
		return sb.toString();
	}
	*/

	private static int ans;
	public int maximumGain(String s, int x, int y) {
		ans = 0;
		if (x > y) {
			s = helper(s, 'a', 'b', x);
			helper(s, 'b', 'a', y);
		} else {
			s = helper(s, 'b', 'a', y);
			helper(s, 'a', 'b', x);
		}
		return ans;
	}

	public String helper(String s, char first, char second, int score) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (!sb.isEmpty() && sb.charAt(sb.length() - 1) == first && c == second) {
				ans += score;
				sb.deleteCharAt(sb.length() - 1);
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
