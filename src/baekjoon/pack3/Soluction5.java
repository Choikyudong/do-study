package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");

		int[] cards = new int[n];
		int i = 0;
		while (st.hasMoreTokens()) {
			cards[i++] = Integer.parseInt(st.nextToken());
		}

		int max = Integer.MIN_VALUE;
		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				for (int l = k + 1; l < n; l++) {
					int sum = cards[j] + cards[k] + cards[l];
					if (sum > m) {
						continue;
					}
					max = Math.max(max, sum);
				}
			}
			if (max == m) {
				break;
			}
		}
		System.out.println(max);
	}

}
