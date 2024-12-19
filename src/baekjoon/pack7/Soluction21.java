package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Soluction21 {

	private static int N;
	private static char[][] rgb;
	public static void main(String[] args) throws IOException {
		// 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		rgb = new char[N][N]; // 일반용
		for (int x = 0; x < N; x++) {
			String str = br.readLine();
			for (int y = 0; y < N; y++) {
				char c = str.charAt(y);
				rgb[x][y] = c;
			}
		}

		// 결과 출력
		StringBuilder sb = new StringBuilder();
		sb.append(searchRgb()).append(" ");

		// 연산을 편하게 하기 위해 G를 R로 변경
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				if (rgb[x][y] == 'G') {
					rgb[x][y] = 'R';
				}
			}
		}
		System.out.println(sb.append(searchRgb()));
	}

	private static int searchRgb() {
		int result = 0;
		checked = new boolean[N][N];
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				if (!checked[x][y]) {
					bfs(x, y, rgb[x][y]);
					result++;
				}
			}
		}
		return result;
	}

	static final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	private static boolean[][] checked;
	private static void bfs(int x, int y, char curC) {
		Queue<int[]> queue = new LinkedList<>(); // x, y, color
		checked[x][y] = true;
		queue.offer(new int[]{x, y});

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int curX = cur[0];
			int curY = cur[1];
			for (int[] dir : dirs) {
				int nx = curX + dir[0];
				int ny = curY + dir[1];
				if (nx >= 0 && N > nx && ny >= 0 && N > ny
						&& rgb[nx][ny] == curC && !checked[nx][ny]) {
					queue.offer(new int[]{nx, ny});
					checked[nx][ny] = true;
				}
			}
		}
	}

}
