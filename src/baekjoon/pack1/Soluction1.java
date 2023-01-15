package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Soluction1 {

	public static void main(String[] arge) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < T; i++) {
			sb.append(soluction(br.readLine())).append('\n');
		}

		System.out.println(sb);
	}

	public static String soluction(String valid) {
		String[] strs = valid.split("");
		Stack<String> stack = new Stack<>();
		for (var str : strs) {
			if (!stack.isEmpty()) {
				if ("(".equals(stack.peek()) && ")".equals(str) ) {
					stack.pop();
				} else {
					stack.push(str);
				}
			} else {
				stack.push(str);
			}
		}

		if (stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

}