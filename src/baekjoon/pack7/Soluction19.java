package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Soluction19 {

	public static void main(String[] args) throws IOException {
		// 박스 크기 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int[][][] tomatoBox = new int[H][N][M];

		// 박스안 토마토 입력
		Queue<int[]> queue = new LinkedList<>();
		int evenTomato = 0; // 익은 토마토 개수
		int allTomato = 0; // 총 토마토 개수
		for (int h = 0; h < H; h++) {
			for (int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int m = 0; m < M; m++) {
					int tomato = Integer.parseInt(st.nextToken());
					tomatoBox[h][n][m] = tomato;
					if (tomato == 1) { // 이븐한 토마토라면
						queue.offer(new int[]{h, n, m});
						evenTomato++;
					}
					if (tomato != -1) { // 토마토만 들어있는 수를 카운트
						allTomato++;
					}
				}
			}
		}
		
		// 처음부터 다 익었다면
		if (evenTomato == allTomato) {
			System.out.println(0);
			return;
		}

		// 방향
		int[][] dirs = {{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}};

		// bfs 실행
		int days = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] cur = queue.poll();
				int h = cur[0];
				int n = cur[1];
				int m = cur[2];
				for (int[] curDir : dirs) {
					int nH = h + curDir[0];
					int nN = n + curDir[1];
					int nM = m + curDir[2];
					// 범위안에 들어오면서 익지않은 토마토가 있다면
					if (nH >= 0 && nH < H && nN >= 0 && nN < N && nM >= 0 && nM < M
							&& tomatoBox[nH][nN][nM] == 0) {
						tomatoBox[nH][nN][nM] = 1;
						evenTomato++;
						queue.offer(new int[]{nH, nN, nM});
					}
				}
			}
			if (!queue.isEmpty()) {
				days++;
			}
		}

		if (evenTomato == allTomato) {
			System.out.println(days);
		} else {
			System.out.println(-1);
		}
	}

}
