package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction5 {

	private static char[][] result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		result = new char[n][n];
		star(0, 0, n, false);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(result[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	private static void star(int x, int y, int n, boolean isBlank) {
		if (isBlank) {
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					result[i][j] = ' ';
				}
			}
			return;
		}

		if (n == 1) {
			result[x][y] = '*';
			return;
		}

		int size = n / 3;
		int count = 0;
		for (int i = x; i < x + n; i += size) {
			for (int j = y; j < y + n; j += size) {
				count++;
				star(i, j, size, count == 5);
			}
		}
	}

}
