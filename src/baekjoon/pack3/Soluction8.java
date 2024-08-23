package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		boolean[][] boards = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < line.length(); j++) {
				boards[i][j] = line.charAt(j) == 'B'; // black == true
			}
		}

		// 탐색
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				int black = 0;
				int white = 0;
				for (int k = 0; k < 8; k++) {
					for (int l = 0; l < 8; l++) {
						boolean curColor = boards[k + i][l + j];
						if ((k + l) % 2 == 0) {
							if (curColor) {
								++white;
							} else {
								++black;
							}
						} else {
							if (curColor) {
								++black;
							} else {
								++white;
							}
						}
					}
				}
				min = Math.min(min, Math.min(black, white));
			}
			if (min == 0) {
				break;
			}
		}
		System.out.println(min);
	}

}