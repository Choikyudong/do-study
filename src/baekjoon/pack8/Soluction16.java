package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction16 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[a];
		int[] dp = new int[a];
		for (int i = 0; i < a; i++) {
			int n = Integer.parseInt(st.nextToken());
			arr[i] = n;
			dp[i] = n;
		}

		for (int i = 0; i < a; i++) {
			for (int j = i; j < a; j++) {
				if (arr[j] > arr[i]) {
					dp[j] = Math.max(dp[j], dp[i] + arr[j]);
				}
			}
		}

		int result = 0;
		for (int i : dp) {
			result = Math.max(i, result);
		}
		System.out.println(result);
	}

}
