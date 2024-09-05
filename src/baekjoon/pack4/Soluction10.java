package baekjoon.pack4;

import java.io.*;
import java.util.StringTokenizer;

public class Soluction10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int commandLines = Integer.parseInt(br.readLine());
		Queue queue = new Queue();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 0; i < commandLines; i++) {
			String input = br.readLine();
			int addNum = 0;
			if (input.charAt(0) == 'p' && !input.equals("pop")) {
				addNum = Integer.parseInt(String.valueOf(input.charAt(5)));
				input = "push";
			}
			switch (input) {
				case "push":
					queue.push(addNum);
					break;
				case "front":
					sb.append(queue.front()).append('\n');
					break;
				case "back":
					sb.append(queue.back()).append('\n');
					break;
				case "size":
					sb.append(queue.size()).append('\n');
					break;
				case "empty":
					sb.append(queue.isEmpty()).append('\n');
					break;
				case "pop":
					sb.append(queue.pop()).append('\n');
					break;
			}
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
	}

}

class Queue {

	private final int[] queue;
	private int front;
	private int end;

	public Queue() {
		this.queue = new int[2_000_000];
		this.front = 0;
		this.end = 0;
	}

	public void push(int num) {
		if (this.end > this.queue.length) {
			this.end = 0;
		}
		this.queue[this.end++] = num;
	}

	public int pop() {
		int returnNum = queue[front];
		if (this.front + 1 > this.queue.length) {
			this.front = 0;
		} else {
			this.front++;
		}
		return returnNum;
	}

	public int front() {
		if (this.isEmpty() == 1) {
			return -1;
		}
		return this.queue[front];
	}

	public int back() {
		if (this.isEmpty() == 1) {
			return -1;
		}
		return this.queue[end - 1];
	}

	public int size() {
		if (front > end) {
			return (this.queue.length - this.front) + this.end + 1;
		} else {
			return this.end;
		}
	}

	public int isEmpty() {
		return this.size() == 0 ? 1 : 0;
	}

}
