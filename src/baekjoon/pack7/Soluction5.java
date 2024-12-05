package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction5 {

	private static String[][] graph;
	private static boolean[][] visited;
	private static int result = 0;
	private static int N = 0;
	private static int M = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		graph = new String[N][M];
		visited = new boolean[N][M];
		int x = 1;
		int y = 1;
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				char info = str.charAt(j);
				if (info == 'I') {
					x = i;
					y = j;
				}
				graph[i][j] = String.valueOf(info);
			}
		}
		dfs(x, y);
		System.out.println(result == 0 ? "TT" : result);
	}

	private static void dfs(int x, int y) {
		if (isIndexOut(x, y) || visited[x][y]) {
			return;
		}

		String curPoint = graph[x][y]; // 현재 위치
		visited[x][y] = true;
		if (curPoint.equals("X")) {
			return;
		} else if (curPoint.equals("P")) {
			result++;
		}

		// 탐색
		dfs(x + 1, y);
		dfs(x, y + 1);
		dfs(x - 1, y);
		dfs(x, y - 1);
	}

	private static boolean isIndexOut(int x, int y) {
		return x >= N || y >= M || 0 > x || 0 > y;
	}

}
