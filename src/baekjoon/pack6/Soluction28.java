package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Soluction28 {

	private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int[][] graph = new int[1001][10001];
		boolean[] dfsVisited = new boolean[1001];
		boolean[] bfsVisited = new boolean[1001];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y] = 1;
			graph[y][x] = 1;
		}

		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				if (j == V && !dfsVisited[j]) {
					dfs(j, graph, dfsVisited);
				}
			}
		}
		sb.append('\n');

		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				if (j == V && !bfsVisited[j]) {
					bfs(j, graph, bfsVisited);
				}
			}
		}
		System.out.println(sb);
	}

	private static void dfs(int start, int[][] graph, boolean[] vistied) {
		vistied[start] = true;
		sb.append(start).append(' ');
		for (int i = 1; i < graph[start].length; i++) {
			int curNum = graph[start][i];
			if (curNum == 1 && !vistied[i]) {
				dfs(i, graph, vistied);
			}
		}
	}

	private static void bfs(int start, int[][] graph, boolean[] vistied) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		vistied[start] = true;

		while (!queue.isEmpty()) {
			int cur = queue.poll();
			sb.append(cur).append(' ');

			for (int i = 1; i < graph[cur].length; i++) {
				if (graph[cur][i] == 1 && !vistied[i]) {
					queue.add(i);
					vistied[i] = true;
				}
			}
		}
	}

}
