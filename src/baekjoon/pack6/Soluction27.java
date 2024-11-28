package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction27 {

	private static int[][] graph;
	private static boolean[][] vistied;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			graph = new int[M + 1][N + 1];
			vistied = new boolean[M + 1][N + 1];
			for (int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st.nextToken()) + 1;
				int y = Integer.parseInt(st.nextToken()) + 1;
				graph[x][y] = 1;
			}

			// 탐색
			int count = 0;
			for (int j = 1; j <= M; j++) {
				for (int l = 1; l <= N; l++) {
					if (graph[j][l] == 1 && !vistied[j][l]) {
						dfs(j, l);
						count++;
					}
				}
			}

			sb.append(count).append('\n');
		}
		System.out.println(sb);
	}

	// 방향 이동용
	private static final int[] dirX = {0, -1, 0, 1};
	private static final int[] dirY = {1, 0, -1, 0};
	private static void dfs(int x, int y) {
		vistied[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int moveX = x + dirX[i];
			int moveY = y + dirY[i];

			if (moveX < 0 || moveX >= graph.length || moveY < 0 || moveY >= graph[0].length) {
				continue;
			}

			if (graph[moveX][moveY] == 1 && !vistied[moveX][moveY]) {
				dfs(moveX, moveY);
			}
		}
	}

}
