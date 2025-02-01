package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] switchs = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			switchs[i] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int man = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			// 1은 남자, 2는 여자
			if (man == 1) {
				for (int j = s; j <= n; j += s) {
					switchs[j] = switchs[j] == 0 ? 1 : 0;
				}
			} else if (man == 2) {
				switchs[s] = switchs[s] == 0 ? 1 : 0;
				int front = s - 1;
				int back = s + 1;
				while (s-- > 0) {
					if (front < 1 || back > n) {
						break;
					}
					if (switchs[front] != switchs[back]) {
						continue;
					}
					if (switchs[front] == 1) {
						switchs[front] = 0;
						switchs[back] = 0;
					} else {
						switchs[front] = 1;
						switchs[back] = 1;
					}
					front--;
					back++;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(switchs[i]).append(" ");
			if (i % 20 == 0) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}

}
