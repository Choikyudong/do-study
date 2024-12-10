package baekjoon.pack7;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Soluction8 {

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
		int K = read();
		bfs(N, K);
	}

	public static void bfs(int N, int K) {
		boolean[] visited = new boolean[100_001];
		 Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{N, 0});
		visited[N] = true;

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int position = cur[0];
			int time = cur[1];
			if (position == K) {
				System.out.println(time);
				break;
			}
			if (position - 1 >= 0 && !visited[position - 1]) {
				queue.add(new int[]{position - 1, time + 1});
				visited[position - 1] = true;
			}
			if (position + 1 <= 100_000 && !visited[position + 1]) {
				queue.add(new int[]{position + 1, time + 1});
				visited[position + 1] = true;
			}
			if (position * 2 <= 100_000 && !visited[position * 2]) {
				queue.add(new int[]{position * 2, time + 1});
				visited[position * 2] = true;
			}
		}
	}

}
