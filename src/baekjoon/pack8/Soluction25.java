package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction25 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
			dp[i] = num;
		}

		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i], arr[i] + dp[i - 1]);
		}

		int max = Integer.MIN_VALUE;
		for (int num : dp) {
			max = Math.max(max, num);
		}
		System.out.println(max);
	}

}
