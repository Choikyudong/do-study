package baekjoon.pack7;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Soluction16 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	private static int[][] graph;
	private static int[][] result;
	private static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		int N = read();
		int M = read();
		graph = new int[N][M];
		visited = new boolean[N][M];
		result = new int[N][M];
		int x = 0;
		int y = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int num = read();
				if (num == 2) {
					x = i;
					y = j;
				}
				graph[i][j] = num;
			}
		}

		bfs(x, y);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (graph[i][j] == 1 && !visited[i][j]) {
					sb.append(-1);
				} else {
					sb.append(result[i][j]);
				}
				sb.append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	private static final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	private static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{x, y, 0});
		visited[x][y] = true;

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int curX = cur[0];
			int curY = cur[1];
			int curNum = cur[2];
			for (int[] dir : dirs) {
				int nextX = curX + dir[0];
				int nextY = curY + dir[1];
				int nextNum = curNum + 1;
				if (0 > nextX || nextX >= graph.length
						|| 0 > nextY || nextY >= graph[0].length) {
					continue;
				}
				if (!visited[nextX][nextY] && graph[nextX][nextY] == 1) {
					queue.add(new int[]{nextX, nextY, nextNum});
					result[nextX][nextY] = nextNum;
					visited[nextX][nextY] = true;
				}
			}
		}
	}
}
