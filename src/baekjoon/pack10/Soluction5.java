package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] square = new int[N][M];
		for (int i = 0; i < N; i++) {
			String[] nums = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				square[i][j] = Integer.parseInt(nums[j]);
			}
		}

		int result = 1;
		for (int n = 0; n < N; n++) {
			for (int m = 0; m < M; m++) {
				int length = Math.min(N - n, M - m); // array 초과 방지를 위해 계산함
				for (int i = 1; i <= length; i++) { // i는 정사각형의 길이를 나타냄
					int topLeft = square[n][m];
					int topRight = square[n][m + i - 1];
					int bottomLeft = square[n + i - 1][m];
					int bottomRight = square[n + i - 1][m + i - 1];

					if (topLeft == topRight && topLeft == bottomLeft && topLeft == bottomRight) {
						result = Math.max(result, i * i);
					}
				}
			}
		}
		System.out.println(result);
	}
}
