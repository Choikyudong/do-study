package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction29 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n + 1][1];
		int[][] arr = new int[n + 1][1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		dp[1][0] = Integer.parseInt(st.nextToken());
		for (int i = 2; i <= n; i++) {
			dp[i] = new int[i];
			arr[i] = new int[i];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < i; j++) {
				int num = Integer.parseInt(st.nextToken());
				dp[i][j] = num;
				arr[i][j] = num;
			}
		}

		for (int i = 1; i < n; i++) {
			int repeat = dp[i].length;
			int start = 0;
			int idx = i + 1;
			while (repeat > 0) {
				for (int j = 0; j < 2; j++) {
					dp[idx][start + j] = Math.max(dp[idx][start + j], arr[idx][start + j] + dp[i][start]);
				}
				start++;
				repeat--;
			}
		}

		int max = 0;
		for (int i = 0; i < dp[n].length; i++) {
			max = Math.max(max, dp[n][i]);
		}
		System.out.println(max);
	}

}
