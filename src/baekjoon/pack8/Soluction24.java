package baekjoon.pack8;

import java.io.IOException;

public class Soluction24 {
	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int n = read();
		int[][] arr = new int[n][3];
		for (int i = 0; i < n; i++) {
			arr[i][0] = read();
			arr[i][1] = read();
			arr[i][2] = read();
		}

		int[][] dp = new int[n][3];
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
		for (int i = 1; i < n; i++) {
			dp[i][0] = arr[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
			dp[i][1] = arr[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);;
			dp[i][2] = arr[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);;
		}

		int min = 100_000;
		for (int i = 0; i < 3; i++) {
			min = Math.min(dp[n - 1][i], min);
		}
		System.out.println(min);
	}

}
