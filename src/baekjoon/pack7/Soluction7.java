package baekjoon.pack7;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Soluction7 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	private static int N;
	private static int[][] graph;
	public static void main(String[] args) throws IOException {
		N = read();
		int M = read();
		graph = new int[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			int A = read();
			int B = read();
			graph[A][B] = 1;
			graph[B][A] = 1;
		}

		int result = Integer.MAX_VALUE;
		int person = -1;
		for (int i = 1; i <= N; i++) {
			int bfsResult = bfs(i);
			if (result > bfsResult) {
				result = bfsResult;
				person = i;
			}
		}
		System.out.println(person);
	}

	private static int bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[N + 1];
		int[] distances = new int[N + 1];
		queue.add(start);
		visited[start] = true;
		while (!queue.isEmpty()) {
			int cur = queue.poll();
			for (int i = 1; i <= N; i++) {
				if (graph[cur][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
					distances[i] = distances[cur] + 1;
				}
			}
		}

		int total = 0;
		for (int i = 1; i <= N; i++) {
			total += distances[i];
		}

		return total;
	}

}
