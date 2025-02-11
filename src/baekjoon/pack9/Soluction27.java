package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction27 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			boolean[] prison = new boolean[n + 1];
			for (int i = 1; i <= n; i++) {
				for (int j = i; j <= n; j += i) {
					prison[j] = !prison[j];
				}
			}

			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (prison[i]) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}

}
