package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Soluction10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] graph = new char[N][M];
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				graph[i][j] = line.charAt(j);
			}
		}
		bfs(graph, N, M);
	}

	public static void bfs(char[][] graph, int N, int M) {
		boolean[][] visited = new boolean[N][M];
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{0, 0, 0});
		visited[0][0] = true;

		int result = Integer.MAX_VALUE;
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int curN = cur[0];
			int curM = cur[1];
			int count = cur[2];
			if (curN + 1 == N && curM + 1 == M) {
				result = Math.min(result, count);
			}
			// 위로 이동
			if (curN - 1 > -1 && graph[curN - 1][curM] == '1' && !visited[curN - 1][curM]) {
				queue.add(new int[]{curN - 1, curM, count + 1});
				visited[curN - 1][curM] = true;
			}
			// 아래로 이동
			if (curN + 1 < N && graph[curN + 1][curM] == '1' && !visited[curN + 1][curM]) {
				queue.add(new int[]{curN + 1, curM, count + 1});
				visited[curN + 1][curM] = true;
			}
			// 오른쪽으로 이동
			if (curM + 1 < M && graph[curN][curM + 1] == '1' && !visited[curN][curM + 1]) {
				queue.add(new int[]{curN, curM + 1, count + 1});
				visited[curN][curM + 1] = true;
			}
			// 왼쪽으로 이동
			if (curM - 1 > -1 && graph[curN][curM - 1] == '1' && !visited[curN][curM - 1]) {
				queue.add(new int[]{curN, curM - 1, count + 1});
				visited[curN][curM - 1] = true;
			}
		}
		System.out.println(result + 1);
	}

}
