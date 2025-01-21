package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction26 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] wineList = new int[n];
		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			int wine = Integer.parseInt(br.readLine());
			wineList[i] = wine;
			dp[i] = wine;
		}

		if (n == 1) {
			System.out.println(dp[0]);
		} else if (n == 2) {
			System.out.println(wineList[0] + wineList[1]);
		} else if (n == 3) {
			int case1 = wineList[0] + wineList[1];
			int case2 = Math.max(Math.max(wineList[0] + wineList[1], wineList[0] + wineList[2]), wineList[1] + wineList[2]);
			System.out.println(Math.max(case1, case2));
		} else {
			int max = 0;
			dp[1] = wineList[0] + wineList[1];
			max = Math.max(max, dp[1]);
			dp[2] = Math.max(Math.max(wineList[0] + wineList[1], wineList[0] + wineList[2]), wineList[1] + wineList[2]);
			max = Math.max(max, dp[2]);
			for (int i = 3; i < n; i++) {
				dp[i] = Math.max(Math.max(dp[i - 2] + wineList[i], dp[i - 3] + wineList[i - 1] + wineList[i]), dp[i - 1]);
				max = Math.max(max, dp[i]);
			}
			System.out.println(max);
		}
	}

}
