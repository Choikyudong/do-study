package baekjoon.pack6;

import java.io.IOException;
import java.util.PriorityQueue;

public class Soluction29 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int N = read();
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			int num = read();
			if (num == 0 && priorityQueue.isEmpty()) {
				sb.append('0').append('\n');
			} else if (num == 0) {
				sb.append(priorityQueue.poll()).append('\n');
			} else {
				priorityQueue.add(num);
			}
		}
		System.out.println(sb);
	}

}
