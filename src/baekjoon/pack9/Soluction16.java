package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Soluction16 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		while (n-- > 0) {
			Stack<Character> stack = new Stack<>();
			String str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (stack.isEmpty()) {
					stack.add(c);
				} else {
					if (stack.peek() == c) {
						stack.pop();
					} else {
						stack.add(c);
					}
				}
			}
			if (stack.isEmpty()) {
				result++;
			}
		}
		System.out.println(result);
	}

}
