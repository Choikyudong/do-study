package baekjoon.pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Soluction8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String texts = br.readLine();
			if (texts.charAt(0) == '.') {
				break;
			}
			Stack<Character> stack = new Stack<>();
			for (var text : texts.toCharArray()) {
				if (text == '.') {
					break;
				}
				if (text == '(' || text == '[') {
					stack.push(text);
				} else if (!stack.isEmpty() && (text == ')' || text == ']')) {
					char c = stack.peek();
					if (c == '(' && text == ')') {
						stack.pop();
					} else if (c == '[' && text == ']') {
						stack.pop();
					} else {
						stack.push(text);
					}
				} else if (stack.isEmpty() && (text == ')' || text == ']')) {
					stack.push(text);
				}
			}
			sb.append(stack.isEmpty() ? "yes" : "no").append('\n');
		}
		System.out.println(sb.toString());
	}

}
