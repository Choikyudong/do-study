package baekjoon.pack5;

import java.io.*;
import java.util.StringTokenizer;

public class Soluction4 {

	private static int[][][] memo = new int[21][21][21];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a;
		int b;
		int c;
		StringBuilder sb = new StringBuilder();
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if (a == -1 && b == -1 && c == -1) {
				break;
			}
			int w = w(a, b, c);
			sb.append("w(").append(a).append(", ")
					.append(b).append(", ").append(c).append(")")
					.append(" = ").append(w).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
	}

	private static int w(int a, int b ,int c) {
		if ((a >= 0 && 20 >= a) &&
				(b >= 0 && 20 >= b) &&
				(c >= 0 && 20 >= c) && memo[a][b][c] != 0) {
			return memo[a][b][c];
		}

		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}

		if (a > 20 || b > 20 || c > 20) {
			return memo[20][20][20] = w(20, 20, 20);
		}

		if (a < b && b < c) {
			return memo[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		}

		return memo[a][b][c] = w(a - 1, b, c) +
				w(a - 1, b - 1, c) +
				w(a - 1, b, c - 1) -
				w(a - 1, b - 1, c-1);
	}

}
