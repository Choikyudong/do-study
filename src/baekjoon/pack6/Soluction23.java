package baekjoon.pack6;

import java.io.IOException;

public class Soluction23 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		// 입력받기
		int N = read();
		int[] stairs = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			stairs[i] = read();
		}

		if (N == 1) {
			System.out.println(stairs[1]);
			return;
		}

		if (N == 2) {
			System.out.println(stairs[1] + stairs[2]);
			return;
		}

		// 계단 최대값 계산
		int[] dp = new int[N + 1];
		dp[1] = stairs[1];
		dp[2] = stairs[1] + stairs[2];
		for (int i = 3; i <= N; i++) {
			dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
		}
		System.out.println(dp[N]);
	}

}
