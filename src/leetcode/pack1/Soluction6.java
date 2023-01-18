package leetcode.pack1;

import java.util.Stack;

/**
 * Question : 20.Valid Parentheses
 * Writer : Kyudong
 * Date : 2023-01-18
 * Time : 오후 11:27
 */
public class Soluction6 {

	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("{[]}"));
	}

	/**
	 * 괄호 맞는지 확인하는 문제
	 * @param s 문자열
	 * @return 맞는지 확인
	 */
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			switch (s.charAt(i)) {
				case ')' :
					if (stack.isEmpty() || stack.peek() != '(') {
						return false;
					}
					stack.pop();
					break;
				case ']' :
					if (stack.isEmpty() || stack.peek() != '[') {
						return false;
					}
					stack.pop();
					break;
				case '}' :
					if (stack.isEmpty() || stack.peek() != '{') {
						return false;
					}
					stack.pop();
					break;
				default:
					stack.push(s.charAt(i));
					break;
			}
		}
		return stack.isEmpty();
	}

}
