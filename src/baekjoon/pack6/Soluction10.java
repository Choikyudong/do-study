package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int commands = Integer.parseInt(br.readLine());
		Stack stack = new Stack(commands);

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 0; i < commands; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
				case "push":
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case "top":
					sb.append(stack.top()).append('\n');
					break;
				case "size":
					sb.append(stack.size()).append('\n');
					break;
				case "pop":
					sb.append(stack.pop()).append('\n');
					break;
				case "empty":
					sb.append(stack.empty()).append('\n');
					break;
			}
		}
		System.out.println(sb);
	}

}

class Stack {

	int pointer;
	int[] arr;
	int curSize;

	public Stack(int size) {
		arr = new int[size];
		pointer = -1;
		curSize = 0;
	}

	public void push(int n) {
		arr[++pointer] = n;
		curSize++;
	}

	public int pop() {
		if (pointer == -1) {
			return -1;
		}
		curSize--;
		return arr[pointer--];
	}

	public int size() {
		return curSize;
	}

	public int empty() {
		return curSize == 0 ? 1 : 0;
	}

	public int top() {
		if (pointer == -1) {
			return -1;
		}
		return arr[pointer];
	}

}
