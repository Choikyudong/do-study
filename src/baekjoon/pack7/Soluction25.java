package baekjoon.pack7;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Soluction25 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	private static final StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		int T = read();
		while (T-- > 0) {
			int a = read();
			int b = read();
			dslr(a, b);
		}
		System.out.println(sb);
	}

	private static void dslr(int a, int b) {
		Queue<Register> queue = new LinkedList<>();
		queue.offer(new Register(a, ""));
		boolean[] visited = new boolean[10_000];
		visited[a] = true;
		while (!queue.isEmpty()) {
			Register register = queue.poll();
			int num = register.num;
			if (num == b) {
				sb.append(register.str).append("\n");
				break;
			}

			int d = (num * 2) % 10_000;
			if (!visited[d]) {
				queue.offer(new Register(d, register.str + 'D'));
				visited[d] = true;
			}

			int s = num == 0 ? 9999 : num - 1;
			if (!visited[s]) {
				queue.offer(new Register(s, register.str + 'S'));
				visited[s] = true;
			}

			int l = (num % 1000) * 10 + (num / 1000);
			if (!visited[l]) {
				queue.offer(new Register(l, register.str + 'L'));
				visited[l] = true;
			}

			int r = (num % 10) * 1000 + (num / 10);
			if (!visited[r]) {
				queue.offer(new Register(r, register.str + 'R'));
				visited[r] = true;
			}
		}
	}

	private static class Register {
		private final int num;
		private final String str;

		public Register(int num, String str) {
			this.num = num;
			this.str = str;
		}
	}

}
