package baekjoon.pack6;

import java.io.IOException;
import java.util.Stack;

public class Soluction14 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int n = read();
		// 목표 수열
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = read();
		}

		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int index = 0; // 목표 수열에 사용
		for (int i = 1; i <= n; i++) {
			stack.push(i);
			sb.append('+').append('\n');
			while (!stack.isEmpty() && arr[index] == stack.peek()) {
				stack.pop();
				sb.append('-').append('\n');
				index++;
			}
		}

		if (stack.isEmpty()) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
	}

}
