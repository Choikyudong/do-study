package baekjoon.pack4;

import java.io.*;
import java.util.StringTokenizer;

public class Soluction7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int commandLines = Integer.parseInt(br.readLine());
		Stack stack = new Stack();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 0; i < commandLines; i++) {
			String input = br.readLine();
			int command;
			int addNum = 0;
			if (input.length() > 1) {
				command = Integer.parseInt(String.valueOf(input.charAt(0)));
				addNum = Integer.parseInt(String.valueOf(input.charAt(2)));
			} else {
				command = Integer.parseInt(input);
			}
			switch (command) {
				case 1:
					stack.push(addNum);
					break;
				case 2:
					sb.append(stack.pop()).append('\n');
					break;
				case 3:
					sb.append(stack.size()).append('\n');
					break;
				case 4:
					sb.append(stack.isEmpty()).append('\n');
					break;
				case 5:
					sb.append(stack.peek()).append('\n');
					break;
			}
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
	}

}

class Stack {

	private final int[] stackBody;
	private int pointer;

	public Stack() {
		this.stackBody = new int[1_000_000];
	}

	public void push(int num) {
		if (pointer > stackBody.length) {
			return; // 여기서는 별도의 처리 하지않음
		}
		this.stackBody[this.pointer++] = num;
	}

	public int pop() {
		if (this.isEmpty() == 1) {
			return -1;
		}
		return this.stackBody[--this.pointer];
	}

	public int peek() {
		if (this.isEmpty() == 1) {
			return -1;
		}
		return stackBody[this.pointer - 1];
	}

	// boolean으로 하면 더 좋겠지만 문제 요구사항을 위해 int로 표현함
	public int isEmpty() {
		return this.pointer == 0 ? 1 : 0;
	}

	public int size() {
		return this.pointer;
	}
}
