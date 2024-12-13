package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < repeat; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int result = -1;
			int lcm = lcm(m, n);
			for (int j = x; j <= lcm; j += m) {
				if ((j - 1) % n + 1 == y) {
					result = j;
					break;
				}
			}

			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}

	public static int lcm(int x, int y) {
		return x * (y / gcd(x, y));
	}

	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
		return gcd(y, x % y);
	}

}
