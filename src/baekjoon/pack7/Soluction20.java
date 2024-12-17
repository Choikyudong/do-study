package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.StringTokenizer;

public class Soluction20 {

	public static void main(String[] args) throws IOException {
		// 박스 크기 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[][] tomatoBox = new int[N][M];

		// 박스에 토마토 넣기
		Queue<TomatoPoint> queue = new LinkedList<>();
		int totalTomato = 0;
		int ripeTomato = 0;
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int m = 0; m < M; m++) {
				int tomato = Integer.parseInt(st.nextToken());
				tomatoBox[n][m] = tomato;
				if (tomato == 1) {
					queue.offer(new TomatoPoint(n, m));
					ripeTomato++;
				}
				if (tomato != -1) {
					totalTomato++;
				}
			}
		}

		// 방향
		int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

		// bfs로 토마토 찾기
		int day = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TomatoPoint tomatoPoint = queue.poll();
				if (Objects.isNull(tomatoPoint)) {
					break;
				}
				int n = tomatoPoint.n;
				int m = tomatoPoint.m;
				for (int[] dir : dirs) {
					int nn = n + dir[0];
					int nm = m + dir[1];
					if (nn < N && nn >= 0 && nm < M && nm >= 0 && tomatoBox[nn][nm] == 0) {
						ripeTomato++;
						tomatoBox[nn][nm] = 1;
						queue.offer(new TomatoPoint(nn, nm));
					}
				}
			}
			if (!queue.isEmpty()) {
				day++;
			}
		}

		if (totalTomato == ripeTomato) {
			System.out.println(day);
		} else {
			System.out.println(-1);
		}
	}

	// 토마토우 개액체
	private static class TomatoPoint {
		private final int n;
		private final int m;

		public TomatoPoint(int n, int m) {
			this.n = n;
			this.m = m;
		}
	}

}
