package baekjoon.pack5;

import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class Soluction18 {

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
		Deque<Integer> deque = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int c = read();
			int num = 0;
			if (c == 1 || c == 2) {
				num = read();
			}
			switch (c) {
				case 1:
					deque.addFirst(num);
					break;
				case 2:
					deque.addLast(num);
					break;
				case 3:
					sb.append(Objects.requireNonNullElse(deque.pollFirst(), -1))
						.append('\n');
					break;
				case 4:
					sb.append(Objects.requireNonNullElse(deque.pollLast(), -1))
						.append('\n');
					break;
				case 5:
					sb.append(deque.size()).append('\n');
					break;
				case 6:
					sb.append(deque.isEmpty() ? 1 : 0).append('\n');
					break;
				case 7:
					sb.append(Objects.requireNonNullElse(deque.peekFirst(), -1))
						.append('\n');
					break;
				default:
					sb.append(Objects.requireNonNullElse(deque.peekLast(), -1))
						.append('\n');
					break;
			}
		}
		System.out.println(sb);
	}

}
