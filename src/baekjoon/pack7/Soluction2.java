package baekjoon.pack7;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public class Soluction2 {

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
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			int num = read();
			if (num == 0) {
				if (queue.isEmpty()) {
					sb.append(0);
				} else {
					sb.append(queue.poll());
				}
				sb.append('\n');
			} else {
				queue.add(num);
			}
		}
		System.out.println(sb);
	}

}
