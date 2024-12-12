package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Soluction11 {

	private static char[][] graph;
	private static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		graph = new char[N][N];
		visited = new boolean[N][N];;
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				graph[i][j] = str.charAt(j);
			}
		}

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <N ; j++) {
				if (graph[i][j] == '1' && !visited[i][j]) {
					list.add(bfs(i, j));
				}
			}
		}
		Collections.sort(list);

		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		for (int i : list) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}

	private static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		visited[x][y] = true;
		queue.add(new int[]{x, y});

		int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		int count = 1;
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = cur[0] + dir[i][0];
				int nextY = cur[1] + dir[i][1];
				if (moveCheck(nextX, nextY)) {
					queue.add(new int[]{nextX, nextY});
					visited[nextX][nextY] = true;
					count++;
				}
			}
		}

		return count;
	}

	private static boolean moveCheck(int nextX, int nextY) {
		if (-1 >= nextX || nextX >= graph[0].length
			|| -1 >= nextY || nextY >= graph[0].length) {
			return false;
		}
		return graph[nextX][nextY] == '1' && !visited[nextX][nextY];
	}

}
